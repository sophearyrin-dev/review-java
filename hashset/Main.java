package hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        var set = new HashSet<>();

        set.add(1);

        System.out.println(set.add(2));
    }
}
