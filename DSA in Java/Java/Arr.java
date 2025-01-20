import java.util.*;

public class Arr {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int a = sc.nextInt();
    System.out.println();
    int arr[] = new int[a];
    int j= arr.length;
    for(int i = 0;i<j;i++){
        System.out.print("Enter the "+ (i+1)+"th element : ");
       int y = sc.nextInt();
       arr[i] = y;

    }
    for (int i = 0;i<j;i++){
        System.out.println("The " +(i+1)+ "th Element is: "+ arr[i]  );
    }
      sc.close();
}

  
}
