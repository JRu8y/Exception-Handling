package io.dimitrivaughn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dimitrivaughn on 5/20/16.
 */
public class CalculatorSpec {

    @Test(expected = DivisionByZeroException.class)
    public void divideTest() throws DivisionByZeroException {
        Calculator calculator = new Calculator();
        double expectedValue = 1;
        double actualValue = calculator.divide(3, 0);
        Assert.assertEquals("expected should be arithmetic error", expectedValue, actualValue, Math.ulp(.001));
    }

    @Test (expected = ComplexNumberException.class)
    public void squareRootTest() throws ComplexNumberException {
        Calculator calculator = new Calculator();
        double expectedValue = 3;
        double actualValue = calculator.squareRoot(-1);

        Assert.assertEquals("expected should be arithmetic error", expectedValue, actualValue, Math.ulp(.001));
    }
}


