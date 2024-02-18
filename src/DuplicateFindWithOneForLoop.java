public class DuplicateFindWithOneForLoop {

      /*
    Run on the main method:

        int[] array = {12 , 23 , 5 , 75 , 12 , 7};
        DuplicateFindWithOneForLoop duplicate = new DuplicateFindWithOneForLoop();
        System.out.println("Duplicate of the Array: " + duplicate.duplicateWithOneLoop(array));
    }

     */

    public static int duplicateWithOneLoop(int[] array){
        // Finding duplicates using only one for loop exercise.

        int duplicate = 0;
        for (int i = 0; i < array.length; i++) { // {12 , 23 , 5 , 75 , 12 , 7}
            // Traversing through the array.
            if (array[0] == array[i]){ // Comparing adjacent elements in the array.
                duplicate = array[i]; // Fixing the value to duplicate variable in the iteration.
            }
        }
        return duplicate;
    }
}
