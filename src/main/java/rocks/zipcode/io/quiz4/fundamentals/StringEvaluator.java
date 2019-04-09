package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        LinkedHashSet<String> dupDeleter = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                dupDeleter.add(string.substring(i, j));
            }
        }
        return dupDeleter.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> list = new ArrayList<>();
        for(String str : getAllSubstrings(string1)){
            for(String str2 : getAllSubstrings(string2)){
                if(str.equals(str2)){
                    list.add(str);
                }
            }
        }
        return list.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commons = getCommonSubstrings(string1, string2);
        String temp = commons[0];
        for(String str : commons){
            if(str.length()>temp.length()){
                temp = str;
            }
        }
        return temp;
    }
}
