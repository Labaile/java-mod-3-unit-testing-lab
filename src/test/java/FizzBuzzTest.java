import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    FizzBuzz f;

    @BeforeEach
    void setUp() {
        f = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzString() {
        String testString = "fub";
        String str = f.fizzBuzzString(testString);
        assertEquals("FizzBuzz", str);
    }

    @Test
    void startswithf() {
        String testString = "fun";
        String str = f.fizzBuzzString(testString);
        assertEquals("Fizz", str);
    }


    @Test
    void endwithb() {
        String testString = "tub";
        String str = f.fizzBuzzString(testString);
        assertEquals("Buzz", str);
    }

    @Test
    void returnsnull() {
        String testString = null;
        String str = f.fizzBuzzString(testString);
        assertEquals(null, str);
    }

}