import java.util.Scanner;
import java.lang.Math;
@SuppressWarnings("Resource leak")

public class MarksToPercentage {
    static void Conerter(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Marks of the subject : ");

        float marks = sc.nextFloat();
        if (marks < 501){
        float PercentageMarks = (marks/500) * 100;
        System.out.println("Your Boards percentage is : " + ((float)Math.round(PercentageMarks*100)/100) + "%");
        }
        else {
            System.out.println("Only enter the marks of the total 5 best subjects!");
        }


    }
    public static void main(String[] args) {
        Conerter();
    }
    
}
