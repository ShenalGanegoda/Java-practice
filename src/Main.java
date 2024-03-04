import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(stringCompression(str));
    }



    public static int[] mergeSort(int[] myArray){ //Merge sort approach.
        int[] sortedArray = new int[myArray.length];
        return sortedArray;
    }


    /*

    Input: "aabcccccaaa"
    Output: "a2b1c5a3"

    String compression
    -

    Write a function that performs basic string compression using the courts of repeated characters.
    For example, the string "aabcceccaaa" would become "a2b1c5a3". If the "compressed" string is not smaller than the
    original string, your function should return the original string.
    You can assume that the string only contains uppercase and lowercase letters (a-z, A-Z).

    */
    public static String stringCompression(String str){ //"aabcccccaaa"
        int count = 0; //Integer variable to hold the count of each letter.
        String newString = ""; //String variable holding the new String.

        for (int i = 1; i < str.length(); i++) {
            count++; //Increasing the variable to check the letter count.
            if (str.charAt(i - 1) != str.charAt(i)) { //Checking for the letter change.
                newString += str.charAt(i - 1) + Integer.toString(count);
                //Creation of the new string with the letter and the count.
                count = 0;
            }
        }
        return newString; // Returning the new string.
    }

    public static int firstOccurrenceIndex(String haystack , String needle){ // Haystack - sadbutsad / Needle - sad

            /*
    Finding the index of the first occurrence in a String.

    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.
    */

        int firstOccurenceIndex = 0; //Variable to hold the index.
        for (int i = 2; i < haystack.length(); i++) {
            if (needle.equals(""+ haystack.charAt(i - 2) + haystack.charAt(i - 1) + haystack.charAt(i))){
                firstOccurenceIndex = (i - 2);
                break;
            } else firstOccurenceIndex = -1;
        }
        return firstOccurenceIndex;
    }

}