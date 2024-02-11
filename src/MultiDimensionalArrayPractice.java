public class MultiDimensionalArrayPractice {

    /*
    Run on the main method:

    int[][] my2DArray =
            {

                    {1 , 4 , 8},
                    {3 , 4 , 6},
                    {3 , 0 , 6}

            };

    MultiDimensionalArrayPractice.multiDimesionalArrayPrint(my2DArray);

     */

    public static void multiDimesionalArrayPrint(int[][] my2DArray){
        for (int i = 0; i < my2DArray.length; i++) {
            System.out.println();
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
        }

    }

    public static void rowsAndColumnsSum2DArray(){}
}
