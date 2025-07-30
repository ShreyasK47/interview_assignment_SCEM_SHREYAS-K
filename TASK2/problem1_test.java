import java.util.Arrays;

public class problem1_test {

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, -1}, false);
        test(new int[]{1, 2, -3, 4}, false);
        test(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true);
        test(new int[]{0, 0, 0, 1}, true);
    }

    private static void test(int[] nums, boolean expected) {
        boolean result = problem1.CheckDuplicate(nums);

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: Input: " + Arrays.toString(nums) +
                               " | Expected: " + expected +
                               " | Got: " + result);
        }
    }
}
