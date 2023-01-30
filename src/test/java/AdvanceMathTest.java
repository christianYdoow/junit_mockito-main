import org.example.AdvanceMath;
import org.example.BasicMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.awt.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AdvanceMathTest {

    @InjectMocks
    AdvanceMath advanceMath = new AdvanceMath();
    @Mock
    BasicMath basicMath;
    @Test
    public void test1(){
        when(basicMath.subtraction(80.0,20.0)).thenReturn(60.0);

        Assert.assertEquals(advanceMath.multiplyByDifference5(80.0,20.0),300.0,0);
    }
    @Test
    public  void test2(){
        when(basicMath.addition(75.0,25.0)).thenReturn(100.0);
        when(basicMath.multiplication(100,5)).thenReturn(500.0);

        Assert.assertEquals(advanceMath.multiplyBySum5(75.0,25.0),500.0,0);
    }
    @Test
    public void test3(){
        when(basicMath.addition(20.0,20.0)).thenReturn(40.0);
        when(basicMath.addition(20.0,20.0)).thenReturn(40.0);


        advanceMath.squareOfSum(20.0,20.0);

        verify(basicMath,atLeast(2)).addition(20.0,20.0);
        verify(basicMath,times(2)).addition(20.0,20.0);
    }
    @Test
    public void  test4(){
        when(basicMath.division(50.0,100.0)).thenReturn(0.5);

        Assert.assertEquals(advanceMath.getPercentage(50.0,100.0),50.0,0);
        reset(basicMath);
        Assert.assertEquals(advanceMath.getPercentage(50.0,100.0),00.0,0);
    }

//    ------------------------------------BDD FORMAT ---------------------------------------------------

    @Test
    public  void test5_1(){
        //Given
        given(basicMath.subtraction(80.0,20.0)).willReturn(60.0);
        //When
        double result1 = advanceMath.multiplyByDifference5(80.0,20.0);
        //then
        Assert.assertEquals(result1,300.0,0);
    }

    @Test
    public void test5_2(){
        //given
        given(basicMath.addition(75.0,25.0)).willReturn(100.0);
        given(basicMath.multiplication(100,5)).willReturn(500.0);
        //when
        double result2=advanceMath.multiplyBySum5(75.0,25.0);
        //then
        Assert.assertEquals(result2,500,0);
    }
    @Test
    public void test5_3(){
        //given
        given(basicMath.addition(20.0,20.0)).willReturn(40.0);
        given(basicMath.addition(20.0,20.0)).willReturn(40.0);

        //when
        double results;
        results=advanceMath.squareOfSum(20.0,20.0);

        //then
        Assert.assertEquals(results,1600,0);
        verify(basicMath,atLeast(2)).addition(20.0,20.0);
        verify(basicMath,times(2)).addition(20.0,20.0);
    }
    @Test
    public void test5_4(){
        //given
        given(basicMath.division(50.0,100.0)).willReturn(0.5);
        given(basicMath.multiplication(0.5,100)).willReturn(50.0);
        //when
        double result3 =advanceMath.getPercentage(50.0,100.0);
        //then
        Assert.assertEquals(result3,50.0,0);
        //when
        reset(basicMath);

        result3=advanceMath.getPercentage(50.0,100.0);
        //then
        Assert.assertEquals(result3,00.0,0);
    }
}
