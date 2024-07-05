import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, FactorialCalc.factorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    void testFactorialPositive() {
        assertEquals(6, FactorialCalc.factorial(3), "Факториал 3 должен быть 6");
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, FactorialCalc.factorial(1), "Факториал 1 должен быть 1");
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalc.factorial(-1), "Должно быть исключение, так как число отрицательное");
    }
}
