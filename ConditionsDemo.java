class ConditionsDemo{
    public static void main(String[] args){

        for(int j = 0;
         j < args.length;
          ++j)
          {
            System.out.println(" " + args[j]);
          }

        //Nested If
        if(args.length > 0){
            Integer mark = Integer.parseInt(args[1]);
            
            if(mark > 60){
                System.out.println("The student got first class in " + args[0]);

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