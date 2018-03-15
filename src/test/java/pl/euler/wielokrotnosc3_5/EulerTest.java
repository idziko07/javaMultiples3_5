package pl.euler.wielokrotnosc3_5;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EulerTest {

    private Euler calculator;

    @Before
    public void init(){
        this.calculator = new Euler();
    }

    @Test
    public void calculateTestForTen(){
        //when
        int sum = calculator.calculate(10);

        //then
        Assert.assertThat(sum, CoreMatchers.is(23));
    }

    @Test
    public void calculateTestForFifteen(){
        //when
        int sum = calculator.calculate(15);

        //then
        Assert.assertThat(sum, CoreMatchers.is(45));
    }

    @Test
    public void calculateTestThirty(){
        //when
        int sum = calculator.calculate(30);

        //then
        Assert.assertThat(sum, CoreMatchers.is(195));
    }

    @Test
    public void calculateTestForThousend(){
        //when
        int sum = calculator.calculate(1000);

        //then
        Assert.assertThat(sum, CoreMatchers.is(233168));
    }

    @Test
    public void calculateTestForZero(){
        //when
        int sum = calculator.calculate(0);

        //then
        Assert.assertThat(sum, CoreMatchers.is(0));
    }
}