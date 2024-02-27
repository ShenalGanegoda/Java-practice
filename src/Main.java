import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstOccurrenceIndex("sadbutsad" , "sad"));
    }



    public static int[] mergeSort(int[] myArray){ //Merge sort approach.
        int[] sortedArray = new int[myArray.length];
        return sortedArray;
    }


    /*
    Finding the index of the first occurrence in a String.

    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.
    */

    public static int firstOccurrenceIndex(String haystack , String needle){ // Haystack - sadbutsad / Needle - sad
        int needleLength = needle.length(); // Storing the needle length in a variable.

        for (int i = 2; i < haystack.length(); i++) {
            if (needle == "" + haystack.charAt(i - 2) + haystack.charAt(i - 1) + haystack.charAt(i + 1)){
                return haystack.charAt(i);
            }
        }
        return -1;
    }

}