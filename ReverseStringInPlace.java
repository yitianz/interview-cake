/* Ch 1: Arrays and Strings */

/* PROBLEM
    Write a function that takes a list of characters and reverses the letters in place.
    Hint: strings are immutable, but list of characters is mutable
*/

class ReverseStringInPlace {
    public static void reverseString(char[] string) {
        // Swap character by character until we get to the middle of the string
        // O(N) time and O(1) space
        int i = 0;
        int j = string.length - 1;
        while (i < j) {
            char tmp = string[i];
            string[i] = string[j];
            string[] = tmp;
        }
    }
    public static void main(String[] args) {
        char[] str = new char[]{'a', 'b', 'c', 'd', 'e'};
        reverseString(str);
        System.out.println(str);
    }
}
