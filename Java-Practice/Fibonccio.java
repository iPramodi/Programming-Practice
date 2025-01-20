import java.util.*;

public class Fibonccio{
    
    public static int fibonaccio(int count){
        if (count==0 ){
            return 0;
        } 
        if (count==1 || count==2) {
            return 1;

        }
        return fibonaccio(count-1 ) + fibonaccio(count-2);
        }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        System.out.print("Fibonaccio series of "+ y + " number is: " );
        for (int i=0;i<y;i++){
                System.out.print(fibonaccio(i)+ " ");
        }
    }

       
    
}