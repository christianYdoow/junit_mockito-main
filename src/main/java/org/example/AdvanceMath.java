package org.example;

public class AdvanceMath {

    private  BasicMath basicMath;

    public double multiplyBySum5(double input1,double input2){
        return basicMath.multiplication(basicMath.addition(input1,input2),5);
    }
    public Double multiplyByDifference5(double input1,double input2){
        return basicMath.subtraction(input1,input2)*5;
    }

    public double getPercentage(double input1, double input2){
        return basicMath.division(input1, input2) * 100;
    }

    public  double squareOfSum(double input1,double input2){
        return basicMath.addition(input1,input2)*basicMath.addition(input1,input2);

    }

}
