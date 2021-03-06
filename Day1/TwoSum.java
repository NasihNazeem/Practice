package Day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        int nums [] = {2,7,11,15};
        int target = 9;

        int []result = new int [2];
        
        result = s.twoSum(nums, target);
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }

    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int [] {map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
