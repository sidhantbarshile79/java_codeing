package com.yash.oops;

public class MatchPatternUtil2 {
    public static int[] findDigitLocation(String string) {
        int count = 0;
        for(int i=0;i<(string.length());i++){
            if(string.charAt(i)>=48 && string.charAt(i)<=56){
                count++;
            }
        }
        int result[]=new int[count];

        int index=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=48 && string.charAt(i)<=56){
                result[index]=i;
                index++;
            }
        }

        return result;
    }


    public static int[] findWhiteSpaces(String string) {
        int count = 0;
        for(int i=0;i<(string.length());i++){
            if((string.charAt(i)==' ') && (string.charAt(i)=='_')){
                count++;
            }
        }
        int result[]=new int[count];

        int index=0;
        for(int i=0;i<string.length();i++){
            if((string.charAt(i)==' ') && (string.charAt(i)=='_') ){
                result[index]=i;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "a12c 3e_456f";
        int[] result = findDigitLocation(input);
        System.out.print("Output for finding Digit location: ");
        for (int i : result) {
            System.out.print(i + " ");
        }

        int[] result2 = findWhiteSpaces(input);
        System.out.println("Output for finding white spaces: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
