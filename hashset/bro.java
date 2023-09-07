package hashset;
import java.util.HashSet;
import java.util.Set;

class bro {

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5};
        System.out.println(containsDuplicate(arr));

    }
    // The method of checking if duplicate exists
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> seenElements = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!seenElements.add(nums[i])) {
                return true;
            }
        }

        return false;

    }
}