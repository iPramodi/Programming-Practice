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

        for (int j = 0; j < size - 1; j++) { // Outer loop for multiple passes
            for (int i = 1; i < size; i++) { // Inner loop for swapping adjacent elements
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    for(int i:arr)
    {
        System.out.println(i);
   }

}
}
