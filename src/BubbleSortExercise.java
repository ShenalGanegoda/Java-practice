public class BubbleSortExercise {


    // Pass in an Integer Array
    // Traverse through the Array using a For-loop
    // Checks if the first element is greater than the other
    // If yes, SWAP!


    public static int[] bubbleSort(int[] myArray){ //Bubble sort approach.
        int tempPosition = 0;
        for (int i = 1; i < myArray.length; i++) { // {6 , 4 , 7 , 1 , 10 , 5};
            if (myArray[i - 1] > myArray[i]) {
                // Swap the Two elements
                tempPosition = myArray[i - 1];
                myArray[i - 1] = myArray[i];
                myArray[i] = tempPosition;
            }
        }
        return myArray;
    }
}
