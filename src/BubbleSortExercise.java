public class BubbleSortExercise {


    // Pass in an Integer Array
    // Traverse through the Array using a For-loop
    // Checks if the first element is greater than the other
    // If yes, SWAP!

    /*
    Run on the main method:

    int[] array = { 6 , 4 , 7 , 1 , 10 , 5 };
        for (int num : BubbleSortExercise.bubbleSort(array)){
        System.out.print(num + " ");
    }

     */

    public static int[] bubbleSort(int[] myArray){ //Bubble sort approach.
        int tempPosition = 0; // Integer value for swapping - temporary position hold.
        boolean swapped = true; // Boolean value to keep track of swapping for the While loop.

        while (swapped){
            swapped = false;
            for (int i = 1; i < myArray.length; i++) { // {6 , 4 , 7 , 1 , 10 , 5};
                if (myArray[i - 1] > myArray[i]) { // If the first value is greater than the next.
                    // Swap the Two elements.
                    tempPosition = myArray[i - 1];
                    myArray[i - 1] = myArray[i];
                    myArray[i] = tempPosition;
                    swapped = true;
                }
            }
        }
        return myArray;
    }
}
