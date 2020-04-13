package other;

import java.util.ArrayList;

public class StringUtil {

    //find all substrings
    public String[] getAllSubstrings(String str){
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                arr.add(str.substring(i,j));
            }
        }return arr.toArray(new String[0]);
    }


    //Write code to check if a String is palindrome or not. Return TRUE if yes, FALSE if not.


    //Write code to check two Strings to see if they are anagrams or not. Return TRUE if yes, FALSE if not.



}
