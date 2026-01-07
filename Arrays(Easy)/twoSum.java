import java.util.Arrays;

public class twoSum {
    public static int[] TwoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res; // return immediately after finding
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
