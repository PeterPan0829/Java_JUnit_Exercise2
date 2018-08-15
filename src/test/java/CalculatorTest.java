package test.java;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void add_5_and_10_return_15() {

        // 1. Arrange
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 10;
        int excepted = 15;

        // 2. Act
        int actual = calculator.add(number1, number2);

        // 3. Assert
        assertThat(actual).isEqualTo(excepted);
    }
    
}

