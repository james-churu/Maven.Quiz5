package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] getAllSubstrings(String string) {

        ArrayList<String> subs = new ArrayList<>();

        for(int x = 0; x <= string.length(); x++){

            for(int z = x+1; z <= string.length(); z++){
                String sub = string.substring(x,z);
                subs.add(sub);
            }
        }
        LinkedHashMap<String , Integer> removeDupes = new LinkedHashMap<>();
        for (String elem : subs){
            removeDupes.put(elem,1);
        }

        String[] answer = new String[removeDupes.size()];
        int x = 0;

        for(String substr: removeDupes.keySet()){
            answer[x] = substr;
            x++;
        }
        return answer;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] first = getAllSubstrings(string1);
        String[] second = getAllSubstrings(string2);

        LinkedHashMap<String , Integer> removeDupes = new LinkedHashMap<>();

        for(int x = 0; x<= first.length -1 ; x++){

            for(int z = 0; z <= second.length -1 ; z++){
                if(first[x].equals(second[z])){
                    removeDupes.put(first[x] , 1);
                    break;
                }
            }
        }

        String[] answer = new String[removeDupes.size()];
        int x = 0;

        for(String substr: removeDupes.keySet()){
            answer[x] = substr;
            x++;
        }
        return answer;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        int largestSize = 0;
        String answer = "";

        for(String string : getCommonSubstrings(string1 , string2)){
            if(string.length() > largestSize){
                largestSize = string.length();
                answer = string;
            }
        }
        return answer;
    }
}
