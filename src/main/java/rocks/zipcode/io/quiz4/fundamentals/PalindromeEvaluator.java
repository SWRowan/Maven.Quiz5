package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        LinkedHashSet<String> dupDeleter = new LinkedHashSet<>();
        Integer counter = 0;
        dupDeleter.add(string);
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                String currentSubstring = string.substring(i,j);
                if(isPalindrome(currentSubstring)){
                    dupDeleter.add(currentSubstring);
                }
            }
        }

        return dupDeleter.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return (reverseString(string).equals(string));
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static Integer countPalindromes(String string){
        int palindromeCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                String currentSubstring = string.substring(i,j);
                if(reverseString(currentSubstring).equals(currentSubstring)) {
                    palindromeCount++;
                }
            }
        }
        return palindromeCount;
    }
}
