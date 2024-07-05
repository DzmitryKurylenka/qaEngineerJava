import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(FactorialCalc.factorial(0), 1, "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(FactorialCalc.factorial(3), 6, "Факториал 3 должен быть 6");
    }

    @Test
    public void testFactorialOne() {
        Assert.assertEquals(FactorialCalc.factorial(1), 1, "Факториал 1 должен быть 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialCalc.factorial(-1);
    }
}