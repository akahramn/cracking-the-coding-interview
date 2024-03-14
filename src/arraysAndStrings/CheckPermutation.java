package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method to decide if one is a permutation
 * of the other.
 **/
public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "denn";
        String str2 = "asdennn";
        System.out.println(check(str1, str2));
    }

    public static Boolean check(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        Character[] charVal = new Character[str1Length];

        for (int i = 0; i <= str2Length - str1Length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (Character character : str1.toCharArray()) {
                if (map.containsKey(character)) {
                    Integer val = map.get(character);
                    map.replace(character, val + 1);
                } else {
                    map.put(character, 1);
                }
            }

            for (int j = 0; j < str1Length ; j++) {
                if (i < str2Length - j) {
                    charVal[j] = str2.charAt(i + j);
                }
            }

            for (Character ch : charVal) {
                if (map.containsKey(ch)) {
                    Integer val =  map.get(ch) - 1;
                    if (val == 0)
                        map.remove(ch);
                    else
                        map.replace(ch, val);
                }
            }

            if (map.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}
