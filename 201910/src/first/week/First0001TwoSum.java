package first.week;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangshouxi on 2019-09-28
 */
public class First0001TwoSum {

    /**
     * 时间换空间
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val) && map.get(val) != i) {
                result[0] = i;
                result[1] = map.get(val);
                return result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int[] nums = {2, 6, 7, 11};
        int target = 12;
        System.out.println(twoSum(nums, target)[1]);
        
    }
    
}
