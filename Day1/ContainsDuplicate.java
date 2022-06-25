package Day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        
        System.out.println(containsDuplicate(array));
        
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        
        for(int i:nums){
            if(!map.contains(i))
                map.add(i);
            else
                return true;
        }
        
        return false;
    } 
    
}