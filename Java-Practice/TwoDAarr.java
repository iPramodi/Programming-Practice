import java.util.Scanner;


public class TwoDAarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Size of the Array in terms of Rows and Columns: ");
        int r= sc.nextInt(),c = sc.nextInt();
        int [][] arr = new int[r][c];
      


        for(int i =0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print("Enter the elements of the array: " );
                arr[i][j] = sc.nextInt();
                System.out.println();

            }
        }
  sc.close();

  System.out.println("\nThe entered 2D array is:");
  for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
          System.out.print(arr[i][j] + " ");
      }
      System.out.println(); // New line after each row
  }






System.out.println(arr[0][1]);
    }
    
}
