public class ClassDemo{
    int test;
    String testStr;

    public void printValues()
    {
        System.out.println("Values: " + test + " " + testStr);
    }

    public void printValues(boolean isPretty){
        if(isPretty){
            System.out.println("Value test: " + test);
            System.out.println("Value testStr: " + testStr);

            return;
        }

        System.out.println("Values: " + test +  " " + testStr);
    }

    public String combine(){
        String temp = ("Values: " + test  + "  " + testStr);
        return temp;        
    }

    public int getTest(){
    int temp = test;
    return temp;        
    }

    public void setTest(int test, int additionalTest){
        this.test = test + additionalTest;
    }

    public ClassDemo(){

    }

    public ClassDemo(int a, String b){
        this.test = a;
        this.testStr = b;
    }

}
/*
class FPTILogger{
    public void logToFPTI(String key, String value)
    {
        logFile.log(key, value);
    }

    public void logToFPTI(int key, String Value)
    {
        String temp = Integer.toString(key);
        logFile.log(key, value);
    }

    public void logToFPTI(String[] keys, String[] values)
    {
        int i = 0;
        for(String key: keys){
            logFile.log(key, values[i++]);
        }
    }




*/