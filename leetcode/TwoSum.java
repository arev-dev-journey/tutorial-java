import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        for(int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; 
    }

public static void main(String[] args) {
  TwoSum solution = new TwoSum();
  int[] nums = {12,17,7,2};
  int target = 9;
  int[] result = solution.twoSum(nums,target);
  System.out.println("Indices: " + result[0] + ", " + result[1]);
  }
}