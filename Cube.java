
public class Cube {

    
    private double volume;
    private double length;
    private double breath;
    private double height;
    private double area;
    private String secureKey;

    private static double PI = 3.14F;

    public static double getPi(){

        //System.out.println("Volume is " + volume); //Error

        return PI;
    }




    public Cube(double height, double breath, double length){
        this.height = height;
        this.length = length;
        this.breath = breath;

        this.area = length * breath;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public double getArea(){
        return area;
    }

    public double CalculateVolume(){
        volume = area * height;
        System.out.println("Volume is " + volume);

        PI = 7;

        return volume;
    }
}
        