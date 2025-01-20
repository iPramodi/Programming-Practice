import java.util.Scanner;
@SuppressWarnings("resource")

public class pascalT{
    public static int Adder(int Val) {
        if (Val>0) {
           System.out.print((Val +  " + "));
            return Val + Adder(Val-1);
        }
        else {
            
            System.out.print(" = ");
            return 0;
        }
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the nubmer you want to add up to: ");
    int r = sc.nextInt();
    System.out.println(Adder(r));


}}