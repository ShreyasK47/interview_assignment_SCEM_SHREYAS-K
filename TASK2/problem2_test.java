import java.util.Arrays;

public class problem2_test {

    public static void main(String[] args) {
        test(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0});
        test(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        test(new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0});
        test(new int[]{0, 1, 0, 4, 21}, new int[]{1, 4, 21, 0, 0});
    }

    private static void test(int[] nums, int[] expected) {
        int[] original = Arrays.copyOf(nums, nums.length);

        problem2.MoveZero(nums);

        if (Arrays.equals(nums, expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: Input: " + Arrays.toString(original) +
                               " | Expected: " + Arrays.toString(expected) +
                               " | Got: " + Arrays.toString(nums));
        }
    }
}
