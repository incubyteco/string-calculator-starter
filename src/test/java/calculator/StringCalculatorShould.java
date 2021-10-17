package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }							//Test case passed
    
    @Test
    void string_with_single_number_should_return_addition_as_int() {				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1,2, stringCalculator.add("1,2")); //3 test case added
    }	
}	
