package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * In this problem, I faced difficulty in figuring out how 
 * to create a method to give multiple values to ONE key. I thought
 * that I could group all words that have one common sorted String 
 * together and just place them onto different lists, but that led 
 * to nowhere. 
 * 
 * Searched up how to give multiple values to one key, and they
 * proposed that I have an ArrayList as the value in my HashMap and
 * ADD the words that share a common sorted String onto that ArrayList.
 * 
 * GENIUS.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> directory = new HashMap<>();
        List<List<String>> finalResult = new ArrayList<>();

        for(String i:strs){
            char tempArray[] = i.toCharArray();
            Arrays.sort(tempArray);
            String key = String.valueOf(tempArray);

            // Add to the list that belong to key IF the list already exists
            if(directory.containsKey(key)){
                directory.get(key).add(i);
            }
            // Create a new List and add this string to that list.
            else {
                directory.put(key, new ArrayList<>());
                directory.get(key).add(i);
            }
        }

        for(String key:directory.keySet()){
            finalResult.add(directory.get(key));
        }

        return finalResult;
    }

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String []strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result;

        result = g.groupAnagrams(strs);

        System.out.println(result);
        
    }
}
