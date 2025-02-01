package Hash;

import java.util.HashSet;
import java.util.Set;

// 폰켓몬 
public class PhoneCatmon {

    public int solution(int[] nums) {

        int result = 0;
        
        Set<Integer> resultset = new HashSet<>();
        for(int num : nums){
            resultset.add(num);
        }

        
        result = nums.length / 2 < resultset.size() ? nums.length / 2 : Math.min(nums.length / 2, resultset.size());
        
        return result;
    }
}
