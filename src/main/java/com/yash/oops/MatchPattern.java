package com.yash.oops;
public class MatchPattern {
    public static int[] matchabSequence(String string) {
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.substring(i, i + 2).equals("ab")) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.substring(i, i + 2).equals("ab")) {
                result[index++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "abaaaba";
        int[] result = matchabSequence(input);
        System.out.print("Output: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}