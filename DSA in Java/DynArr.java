import java.util.*;

//This is the code fot the dynamic array

public class DynArr {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
    sc.close();
      int [] arr = new int[size];
      for (int i = 0; i < size; i++) {

        
          arr[i] = i+1;
        System.out.println(arr[i]);
      }
    }
   

}
