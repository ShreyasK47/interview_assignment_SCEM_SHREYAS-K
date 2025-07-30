public class problem2 {

    public static void MoveZero(int[] nums) {
        int idx = 0; // index to insert the next non-zero element

        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }

        // Fill the rest with zeroes
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
