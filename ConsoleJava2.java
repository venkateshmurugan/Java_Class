class ConsoleJava2{

    public static void main(String[] args){

        System.out.println(" Static Variabl Pi: " + Cube.getPi());
        Cube ac = new Cube(20, 40, 80);
      
        double volume = ac.CalculateVolume();   
        double area = ac.getArea();



       // System.out.println(" Static Variabl Pi: " + Cube.PI);
        System.out.println(" Static Variabl Pi: " + Cube.getPi());

       // double area = ac.area;

 //       ConsoleJava cj = new ConsoleJava();
//        cj.recursionDemo(true);
 //       cj.recursionDemo2(10);
    }

/*    public void recursionDemo(boolean loopBreaker)
    {
        if(loopBreaker == false){
            System.out.println("End of recursion");
            return;
        }

        System.out.println("Print insdie recursion method");

        recursionDemo(false);
    }

        public void recursionDemo2(int loopCounter)
    {
        if(loopCounter == -20){
            System.out.println("End of recursion");
            return;
        }

        System.out.println("Print insdie recursion method " + loopCounter);

        recursionDemo2(--loopCounter);
    }
*/
    /*public static void main(String[] args){
        ClassDemo cd = new ClassDemo(10, "test");

        cd.printValues();
        //cd.printValues(true);

        //String combinedString = cd.combine();

       // System.out.println("Combine String: " + combinedString);

       // ClassDemo newRef = cd;

        testMethod(cd);
        
        System.out.println("After Test Method Values: " + cd.test + " " + cd.testStr);

        //newRef.test = 1000;

        //System.out.println("Values: " + cd.test + cd.testStr);
    }

    //
   // mehodVar = cd;

    public static void testMethod(ClassDemo methodVar){
        
        System.out.println("Inside Test Method Values: " + methodVar.test + " " + methodVar.testStr);

        methodVar.test = 100;

        ClassDemo cd2 = new ClassDemo(50, "Test50");

        mehodVar = cd2;

        methodVar.test = 200;

    }
*/

}