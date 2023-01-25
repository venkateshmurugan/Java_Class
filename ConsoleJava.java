class ConsoleJava{
    public static void main(String[] args){
        ClassDemo cd = new ClassDemo(10, "test");


        cd.printValues();
        cd.printValues(true);

        String combinedString = cd.combine();

        System.out.println("Combine String: " + combinedString);

        //ClassDemo newRef = cd;

        //testMethod(cd);
        
       // System.out.println("Values: " + cd.test + cd.testStr);

        //newRef.test = 1000;

        //System.out.println("Values: " + cd.test + cd.testStr);
    }

    //
   // mehodVar = cd;

  /*  public static testMethod(ClassDemo methodVar){
        
        System.out.println("Values: " + methodVar.test + methodVar.testStr);

        methodVar.test = 100;

    }
*/

}