import java.util.Scanner;

public class Homework1{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Actions : \n1.Multiplication\n2.Subtraction\n3.Addition\n4.Divide\n5.Percentage\n6.Module\n");
        int a;
        float b,c;
        a = sc.nextInt();
        switch(a) {
            case 1 -> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                System.out.print(b*c);
                break;

            }
            case 2-> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                System.out.print(b-c);
                break;

            }
            case 3-> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                System.out.print(b+c);
                break;
        }
            case 4-> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                System.out.print(b/c);
                break;
            } 
            case 5-> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                    System.out.print((b/100)*c);
                    break;
        }  
             case 6-> {
                System.out.print("Enter a digit: ");
                b = sc.nextFloat();
                System.out.print("\nEnter a digit: ");
                c = sc.nextFloat();
                System.out.print(b%c);
                break;
        } 
        default->{
        System.out.println("Please give a correct Input");
        }

            

    }
    sc.close();
}
}