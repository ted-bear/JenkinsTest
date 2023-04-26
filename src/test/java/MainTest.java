import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testTwoSum() {
        Assertions.assertArrayEquals(new int[] {0, 1}, Main.twoSum(new int[] {2,7,11,15}, 9));
        Assertions.assertArrayEquals(new int[] {1, 2}, Main.twoSum(new int[] {3,2,4}, 6));
        Assertions.assertArrayEquals(new int[] {0, 1}, Main.twoSum(new int[] {3,3}, 6));
    }

    @Test
    void testTwoSumNull() {
        Assertions.assertArrayEquals(null, Main.twoSum(new int[] {2,7,11,15}, 8));
    }
}
