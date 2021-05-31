import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit5Day1 {
    @Test
    void sumMethod() {
        Assertions.assertEquals(6, Calculator.sum(4, 2));
        Assertions.assertNotEquals(6, Calculator.sum(2, 5));
    }

    @Test
    void arrayMethod() {
        Assertions.assertArrayEquals(new float[]{1.4f, 4.5f, 1.0f}, new float[]{1.4f, 4.5f, 1.0f});
        Assertions.assertArrayEquals(new float[]{1.4f, 4.5f, 1.0f}, new float[]{1.4f, 4.5f, 1.1f});
    }

    @Test
    void assertNull_assertNotNull() {
        int a;
        int b = 5;
        Assertions.assertNull(null);
        Assertions.assertNotNull(b);

    }

    @Test
    void assertTrue_assertFalse() {
        Assertions.assertTrue(9 > 4, "5 is greater the 4");
        Assertions.assertTrue(null == null, "null is equal to null");
        Assertions.assertFalse(1 > 5, "5 is greater the 4");

    }

    @Test
    void assertSame_assertNotSame() {
        String original = "Thực hành JUnit 5";
        String clone = original;
        String other = "Day1";
        
        Assertions.assertSame(original, clone);
        Assertions.assertNotSame(original, other);
    }
}
