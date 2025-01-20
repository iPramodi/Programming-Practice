import java.util.*; //Java gives random value in double data type between 1.0 and less than 6 by default

public class RandNum {
     
    static  int high = 6;
    static int lo = 1;

    public static void main(String[] args) {
        System.out.print("Enter no. of times you want to Roll Dice: " );
        
        
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            for (int i =0;i<x; i++){
                
                int ran = (int)(Math.random()*(high-lo +1)) +lo;
                System.out.println("Your dice is rolled on: " + ran);
            }
        }
        


        }


    }    

/*public class RandNum {
    
static int high,low,ran;


    public static void main(String[] args){ 
        high = 6;
        low = 1;
        ran = (int)(Math.random()*(high-low +1)) +low;
        System.out.println("Your dice is rolled on: " + ran);

    
    
    
    
    }

}*/