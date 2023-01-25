package org.example;

public class AdvanceMath {

    private  BasicMath basicMath;

    private  final double LOOP_TIMES = 3.0;
    public Double multiplyBySum5(double input1,double input2){
         double sum=basicMath.addition(input1,input2);
         return sum*5;
    }
    public Double multiplyByDifference5(double input1,double input2){
        double difference=basicMath.subtraction(input1,input2);
        return difference*5;
    }

    public void executedAllBasicOutput(double input1,double input2){
        double add= basicMath.addition(input1,input2);
//        double sub= basicMath.subtraction(input1,input2);
        double multiply=basicMath.multiplication(input1,input2);
    }

    public double loopSum3Times(double input1, double input2) {
        double sum = 0;
        for(int i=0; i<LOOP_TIMES; i++) {
            sum = basicMath.addition(input1, input2);
        }
        return sum;
    }

    public double getPercentage(double input1, double input2){
        return basicMath.division(input1, input2) * 100;
    }



    public  double squareOfSum(double input1,double input2){
          double sum = basicMath.addition(input1,input2);
          return  Math.pow(sum,2);
    }

}
