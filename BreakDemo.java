

public class BreakDemo {

    public static void main(String[] args) {


         //if(args.length > 0){
         //   Integer i = Integer.parseInt(args[0]);


        int arrayNumbers[] = {10, 20, 80, 30, 90, 40, 50 ,60, 70, 80, 90}; 

        boolean t = true;

        first: {
                System.out.println("Inside First Block");
            second: {

                System.out.println("Inside Second Block");
                third:
                {
                    System.out.println("Inside thrid Block");
                    
                    if(t)
                        break second;  
                }
                
                System.out.println("End of Second Block");

            }

            System.out.println("End of First Block");

        }

    }

}