package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/20/16.
 */
public class Calculator {

    public double result;

    public static double add(double num1, double num2){
        return num1+num2;
    }

    public static double subtract(double num1, double num2){
        return num1-num2;
    }

    public static double multiply(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2) throws DivisionByZeroException{
        if(num2==0) throw new DivisionByZeroException("Can't divide by zero!!");
        return num1/num2;
    }

    public static double squareRoot(double num1) throws ComplexNumberException{
        if(num1<0) throw new ComplexNumberException();
        return Math.sqrt(num1);
    }


}
