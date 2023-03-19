package hu.me.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void testAddition() {
        Integer result = Calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAdditionWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.add(2, null);
        });
    }
}
