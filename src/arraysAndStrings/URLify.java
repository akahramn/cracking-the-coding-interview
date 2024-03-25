package arraysAndStrings;

/**
// * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: If implementing in java, please use a
 * character array so that you can perform this operation in place)
 * Input: "Mr John Smith", 13
 * Output: "Mr%20John%20Smith"
 */
public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith";
        System.out.println(replaceSpaces(input));
    }

    public static String replaceSpaces(String input ) {
        input = input.trim();
        input = input.replaceAll(" ", "%20");
        return input;
    }
}
