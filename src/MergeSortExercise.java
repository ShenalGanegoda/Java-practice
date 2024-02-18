public class MergeSortExercise {

    public static void mergeSort(){
        int[] myArray = { 2 , 45  , 5 , 1 , 56 , 6 , 21 , 7 , 6};
        int midPoint = myArray.length / 2;
        
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[myArray.length - midPoint];

        for (int i = 0; i < myArray.length; i++) {
            if (i < midPoint){ // Breaking the Array into Left side
                leftArray[i] = myArray[i]; // Assigning the value to
            } else rightArray[i] = myArray[i];
        }
    }
}
