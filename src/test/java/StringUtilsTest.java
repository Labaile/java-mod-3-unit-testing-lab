import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsTest {
    StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void reserve() {
        String testString = "sample";
        String reversed = stringUtils.reverse(testString);
        assertEquals("elpmas", reversed);
        reversed = stringUtils.reverse(reversed);
        assertEquals("sample", reversed);
    }

    @Test
    void reserveNull() {
        String testString = null;
        String reversed = stringUtils.reverse(testString);
        assertNull(reversed);
    }
}