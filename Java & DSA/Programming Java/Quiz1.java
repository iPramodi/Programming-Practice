import java.util.Scanner;

;

public class Quiz1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Natural no. you want to Sum of: ");
        int a = sc.nextInt();
        int b = 0;
        for (int i =1;i<=a;i++){
            b = b+i;
        }

        System.out.println("The sum of natural number upto n numbers : " + b);
        sc.close();
    }
    
}
