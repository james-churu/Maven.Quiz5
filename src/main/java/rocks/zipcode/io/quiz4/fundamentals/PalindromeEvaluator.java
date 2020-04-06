package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        ArrayList<String> palindromes = new ArrayList<>();
        Integer count = 0;

        for(int x = 0; x <= string.length(); x++){

            for(int z = x+1; z <= string.length(); z++){
                String sub = string.substring(x,z);
                String subrev = new StringBuilder(sub).reverse().toString();

                if(sub.equals(subrev)){
                    palindromes.add(sub);
                    count++;
                }
            }

        }
        LinkedHashMap<String , Integer> removeDupes = new LinkedHashMap<>();
        for (String elem : palindromes){
            removeDupes.put(elem,1);
        }

        String[] pals = new String[removeDupes.size()];
        int count2 = 0;
        for(String stringElem : removeDupes.keySet()){
            pals[count2] = stringElem;
            count2++;
        }

        return pals;
    }

    public static Boolean isPalindrome(String string) {

        if(getAllPalindromes(string).length > 0 && string.equals(reverseString(string))){
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
