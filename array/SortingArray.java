package array;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        String word = "apple";
        char arr[] = word.toCharArray();
        char count[] = new char[26];
        for(char c: arr) count[c-'a']++;
        String sorted = String.valueOf(count);
        System.out.println(sorted.toString());
    }
    
}
