package arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    /**
     * Implement an algorithm to determine if a string has all
     * unique characters. What if you can not use additional data structures?
     * **/
    public static void main(String[] args) {
        String val = "Deniz";
        System.out.println(checkStringIsUnique(val));

    }

    public static Boolean checkStringIsUnique(String str) {
        char[] arr = str.toCharArray();
        Set<Character> setList = new HashSet<>();
        for (char val : arr) {
            if (!setList.add(val))
                return false;
        }
        return true;
    }
}
