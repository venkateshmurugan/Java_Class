class ConditionsDemo{
    public static void main(String[] args){ //command line argument or command line parameter

        for(int j = 0; j < args.length; ++j)
          {
            System.out.println(" " + args[j]);
          }

        //java ConditionsDemo 60 70 80 90 100
        //args
        //{60, 70, 80}
        //args[0] 60
        //args[1] 70
        // args[2] 80


        //java ConditionsDemo English 90
        //java ConditionsDemo

        //Sting[] num = new String[2];
        //num[0] = "English";
        //num[1] = "90";

        //String[] num;

        //args {"English", "90"}
        int x = 1;
        int y = 0;

        //Nested If
        if(args.length > 0){
            Integer mark = Integer.parseInt(args[x]);
            
            if(mark > 60){
                System.out.println("The student got first class in " + args[y]);

                if(mark > 75){
                    System.out.println("The student got distinction class in " + args[0]);    
                }
            }
            else{
                System.out.println("The student did not get first class in " + args[0]);

                if(mark < 45){
                System.out.println("The student did not pass in " + args[0]);    
                }
            }

        //If else Ladder
        if(mark  < 45){
            System.out.println("The student did not earn any badge in " + args[0]);   
        }
        else if((mark  >= 45) && (mark <= 60)){
            System.out.println("The student earned a white badge in " + args[0]);   
        }
        else if((mark  > 60) && (mark <= 75)){
            System.out.println("The student earned a Yellow badge in " + args[0]);   
        }
        else if((mark  > 75)  && (mark <= 90)){
            System.out.println("The student earned a Green badge in " + args[0]);   
        }
        else{
            System.out.println("The student earned a Black badge in " + args[0]);
        }

        }
        System.out.println("This is the end of the program");
    }
}