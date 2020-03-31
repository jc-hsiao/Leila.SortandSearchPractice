package search;

import java.util.ArrayList;

public class FindSubstrings {

    public String[] getAllSubstrings(String str){
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                arr.add(str.substring(i,j));
            }
        }
        return arr.toArray(new String[0]);
    }

    //dog
    //012
    //d,do,dog
    //o,og
    //g


}
