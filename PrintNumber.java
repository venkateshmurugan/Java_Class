public class PrintNumber {

    public static void main(String[] args) {
        int[] digits = new int[2];

        digits[1] = Integer.parseInt(args[0])/10; 
        digits[0] = Integer.parseInt(args[0])%10;

        if(digits[1] == 1){
            if(digits[0] == 0){
                System.out.println("Ten");
            }
            else if(digits[0] == 1)
            {
                System.out.println("Eleven");
            } else if(digits[0] == 8)
            {
                System.out.println("Eighteen");
            }
            else{
                System.out.println("Nineteen");
            }
        }
        else{
             if(digits[1] == 2)
             {
                System.out.print("Twenty ");
             }
             else(digits[1] == 9)
             {
                System.out.print("Ninety ");
             }

             if(digits[0] == 1){
                System.out.println("One");
             }
             else{
                System.out.println("Nine");
             }
        }
    }
}