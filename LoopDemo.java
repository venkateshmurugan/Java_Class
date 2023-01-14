
public class LoopDemo {

    public static void main(String[] args) {

        //for(assignment;condition;increment/decrement)
/*
        int arrayNumbers[] = {10, 20, 30, 40, 50 ,60, 70, 80, 90}; 

        int size = arrayNumbers.length;


        for(int i = 0; i < size; ++i){

            int x = arrayNumbers[i];
            System.out.println("The array value at " + i + " is " + x);

        }

        System.out.println("The values of array are as follows");


        for(int x : arrayNumbers){
             System.out.println(x);
        }

*/

        int multiArray[][] = {
                        {10, 20, 30, 40, 50 ,60, 70, 80, 90}, //0th Array
                        {100, 200, 300, 400, 500 ,600, 700, 800, 900}, //1st Array
                        {1000, 2000, 3000, 4000, 5000 ,6000, 7000, 8000, 9000},
                        {10000, 20000, 30000, 40000, 50000 ,60000, 70000, 80000, 90000},
                        };

    /*    int arrayOne[] = multiArray[0];
        int arrayTwo[] = multiArray[1];
        int arrayThree[] = multiArray[2];
        int arrayFoul[] = multiArray[3];
*/
 /*       for(int arrayTemp[] : multiArray){

            System.out.println("Printing Inner Array: ");
            for(int value: arrayTemp){
                System.out.println("Value: " + value);
            }
        }
*/


        //Loop 4 times
        for(int i = 0; i < 4; ++i ){

            //loop 9 times
            for(int j = 0; j< 9; ++j){

               // System.out.println("Element at [" + 0 + " ]" + "[" + 0 + "] is " + multiArray[0][0]);

                System.out.println("Element at [" + i + "]" + "[" + j + "] is " + multiArray[i][j]);
            }
        }

    //    System.out.println("Printing Element at 4th index in 1st array");

      //  int Value2 = multiArray[1][4];


  //      System.out.println("Value is " + Value2);

        
/*        for (int i = 0; i > 10; ++i) {
            System.out.println("tick " + i);
        }

        int[] array = new int[100]; //array[0], array[1]

        for (int i = 0; i < 10; ++i) {
            array[i] = i + 100; //array[0] = 0 + 100;
        }

        for (int x = 0; x < 100; ++x) {
            array[x] = x + 1000; //array[0] = 0 + 1000;
        }

        int j = 0;
        while(j < 100){
            System.out.println("The value of array element in index " + j + " is: " + array[j]);
            j++;
        }

    */
    }

}