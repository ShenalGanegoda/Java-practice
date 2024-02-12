import java.util.Random;

public class RandomNumberPick {
    public static int[] array;
    static Random random = new Random(); // Random class instance creation

    /*

    Run in main:

            int[] myArray = {2 , 5 , 6 , 9 , 12 , 34 , 36};
        RandomNumberPick rand = new RandomNumberPick(myArray);

        System.out.println(rand.randomNumberPick());

    */
    public RandomNumberPick(int[] array){
        this.array = array;
    }
    public static int randomNumberPick(){
        //Picking a random number using the Random class
        int randomNumber = random.nextInt(array.length); //Using the "nextInt" method to create a field for the random number



        int pickedRandomNumber = 0;
        for (int i = 0; i < array.length; i++) { // Traversing through the Array
            pickedRandomNumber = array[randomNumber]; // Using the random variable to pick a number
        }

        return pickedRandomNumber;
    }
}
