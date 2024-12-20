package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayTest {
    public static void main(String[] args) {

        
        System.out.println(new int[]{1,2});

        // Create a list of lists
        List<List<Integer>> listOfLists = new ArrayList<>();
        
        // Add sublists with unique elements
        listOfLists.add(List.of(1, 2));
        listOfLists.add(List.of(2, 3));
        listOfLists.add(List.of(3, 4));
        
        // Print the list of lists
        System.out.println(listOfLists); //[[1,2],[2,3],[3,4]]


        
        // Use a Set to ensure unique lists
        Set<List<Integer>> uniqueLists = new HashSet<>();

        // Add sublists to the set
        uniqueLists.add(List.of(1, 2));
        uniqueLists.add(List.of(2, 3));
        uniqueLists.add(List.of(3, 4));
        uniqueLists.add(List.of(1, 2)); // Duplicate, won't be added
        
        // Convert the set back to a list if ordering or other operations are needed
        List<List<Integer>> listOfUniqueLists = new ArrayList<>(uniqueLists);

        // Print the unique lists
        System.out.println(listOfUniqueLists);

        //3. add list of list
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1, 2, 3));// [[1,2,3]]
        result.add(Arrays.asList(3, 4, 5));// [[1,2,3],[3,4,5]]


        char c = '0';
        System.out.println(Character.isLetter(c)); //a-z, A-Z -false

        char a = '0';
        System.out.println(Character.isLetterOrDigit(a)); //a-Z, A-Z, 0-9 - true

    }
}
