package au.com.fox.utils;

public class StringUtils {
    public String reverse(String reverseString) {
        return (reverseString.length() == 0) ? "" : reverseString.toCharArray()[reverseString.length() - 1] + reverse(reverseString.substring(0, reverseString.length() - 1));
    }
}
