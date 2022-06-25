package Day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        boolean res = Arrays.equals(sArray, tArray);

        return res;

        
    }

    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();
        String s = "car";
        String t = "car";

        System.out.println(v.isAnagram(s, t));
       
    }
}
