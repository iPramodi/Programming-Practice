import java.util.*;


public class Dynarr {
    public static void main(String[] args)
{   
    int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            a = sc.nextInt();
        }
    int [] arr = new int[a];
    for (int i = 0;i<a;i++){
        arr[i] = i+1;
        System.out.println(arr[i]);
        
    }


}    
}
