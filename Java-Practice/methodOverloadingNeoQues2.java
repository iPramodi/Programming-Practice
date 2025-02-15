import java.util.*;
class CircleUtils{
    public static  double calculateCircumference(int r){
        return(2*3.14*r);
    }
    public static double calculateArea(double r){
        return (r*3.14*r);

    }
    public static double calculateCircumference(double r){
        return(2*3.14*r);
    }
    public static double calculateArea(int r){
        return(r*3.14*r);
    }
}
public class methodOverloadingNeoQues2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radiusInt = scanner.nextInt();
        double radiusDouble = scanner.nextDouble();
        double circumferenceInt= CircleUtils.calculateCircumference(radiusInt);
        double circumferenceDouble = CircleUtils.calculateCircumference(radiusDouble);
        double areaInt = CircleUtils.calculateArea(radiusInt);
        double areaDouble = CircleUtils.calculateArea(radiusDouble);

        System.out.format("%.2f %.2f\n", circumferenceInt,circumferenceDouble);
        System.out.format("%.2f %.2f",areaInt,areaDouble);
        scanner.close();
        
    }
}