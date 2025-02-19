import java.util.Scanner;
// calculateCircumference- To calculate the circumference using the formula 2 * 3.14 * radius
// calculateArea- To calculate the area 3.14 * radius * radius
class CircleUtils {
  
    public static double calculateCricumference(int radI){
        return (2*3.14*radI);
    }
    public static double calculateCricumference(double radD){
        return (2*3.14*radD);

    }
    public static double calculateArea(int radI){
        return (3.14*radI*radI);
    }
    public static double calculateArea(double radI){
        return (3.14*radI*radI);}
}


public class NeoQuesU2_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int radiusInt = scanner.nextInt();
        double radiusDouble = scanner.nextDouble();
        double circumferenceInt = CircleUtils.calculateCricumference(radiusInt);
        double circumferenceDouble = CircleUtils.calculateCricumference(radiusDouble);
        double areaInt = CircleUtils.calculateArea(radiusInt);
        double areaDouble = CircleUtils.calculateArea(radiusDouble);
        System.out.format("%.2f %.2f\n", circumferenceInt, circumferenceDouble);
        System.out.format("%.2f %.2f", areaInt, areaDouble);
        scanner.close();
    }
    }
    

