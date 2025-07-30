import java.util.HashSet;

public class problem1 {

    public static boolean CheckDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // All elements are unique
    }
}
