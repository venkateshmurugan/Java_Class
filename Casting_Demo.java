class Casting_Demo{

public static void main(String[] args){
    short a = 10;
    short b = 10;
   // int c = a + b;

    short d = (short) (a + b);

    double x = d;

    //Auto Casting
    int y = d;

    //Explicit Casting 
    long ll = (long)4.5f;

    System.out.println("Test d " + d);
    System.out.println("Test x " + x);

    int account_number = (int)getAccountNumber("Stephen");

    System.out.println("Account Number " + account_number);


    float f1 = 2.5f;
    float f2 = 6.5f;
    
    float f3 = f2 % f1;


    System.out.println("Modulus response "+ f3);

}

public static double getAccountNumber(String name){
    return 434232.879;
}

}