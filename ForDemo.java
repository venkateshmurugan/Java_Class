public class ForDemo {

    public static void main(String[] args) {

        //for(assignment;condition;increment/decrement)

        for (int i = 0; i > 10; ++i) {
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
    }

}