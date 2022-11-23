class ConditionsDemo{
    public static void main(String[] args){

        for(int j = 0; j < args.length; ++j)
            System.out.println(" " + args[j]);

        if(args.length > 0){
            Integer i = Integer.parseInt(args[0]);
            
            if(i > 60){
                System.out.println("The student got first class");

                if(i > 75){
                System.out.println("The student got distinction class");    
                }
            }
            else{
                System.out.println("The student did not get first class");

                if(i < 45){
                System.out.println("The student did not pass");    
                }
            }

        }
        System.out.println("This is the end of the program");
    }
}