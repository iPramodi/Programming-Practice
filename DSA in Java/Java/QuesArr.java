import java.util.Scanner;

public class QuesArr {
    public static void main(String [] args){
        try (Scanner var1 = new Scanner(System.in)) {
            System.out.print("Enter the lenght of the array: ");
            int var2 = var1.nextInt();
            System.out.println();
            int[] var3 = new int[var2];
            for(int i = 0;i<var2;i++){
                System.out.print("Enter the "+ (i+1)+"th element: ");
                int var4 = var1.nextInt();
                System.out.println();
                var3[i] = var4;

            }
            System.out.print("Enter the Entry you want to find: ");// This method is also known as linear search
                        int var5 = var1.nextInt();

            for(int i = 0;i<var2;i++){
                if (var3[i]==var5){
                    System.out.println("The entry is on index: "+i);
                    
                }
               

            }
            System.out.println();
        }
    }
    
}
