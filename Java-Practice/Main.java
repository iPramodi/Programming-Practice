import java.util.Scanner;
public class Main{
   
    static int Adderr() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number to add: ");
        int noOne = sc.nextInt();
        System.out.print("Enter the 2nd number to add: ");
        int noSec = sc.nextInt();
        System.out.print("Enter the 3rd number to add: ");
        int noThrd = sc.nextInt();
        
        return noOne + noSec + noThrd;


    }
    static void Checkker() {
        @SuppressWarnings("resource")
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a INTEGER : ");
        boolean b = (val.hasNextInt());
        System.out.println(b);

    }
    static void Quiz() {
        
        
        
        
    }

    public static void main(String[] args) {
      //  Checkker();
      
       

    }

}
