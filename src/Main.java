import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3 , 0 , 1};
        missingNumber(nums);
    }

    public static int[] mergeSort(int[] myArray){ //Merge sort approach.
        int[] sortedArray = new int[myArray.length];
        return sortedArray;
    }

    /*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    Examples:

    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
    2 is the missing number in the range since it does not appear in nums.
    Example 2:

    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
    2 is the missing number in the range since it does not appear in nums.
    Example 3:

    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
    8 is the missing number in the range since it does not appear in nums.

     */

    public static void missingNumber(int[] nums){ // [3,0,1]
        int arrayLength = nums.length;
        int[] newArray = new int[nums.length];

        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = i + 1; //Creating new array with the length of the array.
        }
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
            if (str.charAt(i - 1) != str.charAt(i)) { //Checking for the letter change
                if (i ==  str.length() -1){
                    newString += str.charAt(i - 1) + Integer.toString(count) + 1;
                    // Condition for the last character section.
                }
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