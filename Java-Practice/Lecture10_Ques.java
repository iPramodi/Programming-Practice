import java.util.Scanner;

public class Lecture10_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        
        for (int i = 0;i<size;i++){
            System.out.print("Enter the array Entry: ");

            arr[i] = sc.nextInt();
            System.out.println();


        }

     /*    for (int i = 0;i<size;i++){
            System.out.println( arr[i]);
          
       
    } */ 
   for(int i:arr){
    //System.out.println(i);
    
   }

}
}