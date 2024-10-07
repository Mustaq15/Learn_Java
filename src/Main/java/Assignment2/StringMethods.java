package Assignment2;


import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //1. charAt(int index): Returns the character at the specified index.
        String str = "Hello";
        char result = str.charAt(1);
        System.out.println(result);        // 'e

        //2. length(): Returns the length of the string.
        int length = str.length();
        System.out.println(length);    // 5

        //3. substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string
        String substr = str.substring(1, 4);
        System.out.println(substr);    // "ell"

        //4. contains(CharSequence s): Checks if the string contains the specified sequence of char values.
        boolean contains = str.contains("ell");
        System.out.println(contains);    // true

        //5. equals(Object anObject): Compares this string to the specified object.
        boolean isEqual = str.equals("Hello");
        System.out.println(isEqual);    // true

        //6. toUpperCase(): Converts all characters in the string to uppercase.
        String upper = str.toUpperCase();
        System.out.println(upper);        // "HELLO"

        //7. toLowerCase(): Converts all characters in the string to lowercase.
        String lower = str.toLowerCase();
        System.out.println(lower);         // "hello"

        //8. trim(): Removes whitespace from both ends of the string.
        String trimmed = str.trim();
        System.out.println(trimmed);     // "Hello" (if there were leading/trailing spaces)

        //9. replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar with newChar.
        String replaced = str.replace('l', 'p');
        System.out.println(replaced);     // "Heppo"

        //10. split(String regex): Splits this string around matches of the given regular expression.
        String[] parts = str.split("l");
        System.out.println(Arrays.toString(parts));         // ["He", "", "o"]
    }
}