import java.util.*; 
public class Constructors {
    private int[][] Arry;
    int r,c;
//This is to give the size of the Arryay
    public void CreateArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        r = sc.nextInt();
        System.out.print("Enter the no. Column: ");
        c = sc.nextInt();
        Arry = new int[r][c];
        


    }
//This is to give the elements of the Arryay
    public void element(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a " + r + "x" + c + " matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                Arry[i][j] = sc.nextInt();
       



 }
    }
        }
    public void dispArr() {
        System.out.println("\nThe Matrix:");
        for (int[] row : Arry) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    
public int[][] getArryay(){
    return Arry;

}



}