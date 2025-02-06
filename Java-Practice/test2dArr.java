
import java.util.Scanner;

public class test2dArr {
    public static void main(String[] args) {
       Constructors p = new Constructors();
       p.CreateArr();
       p.element();
       int[][] arr = p.getArryay();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the entry you want to find: ");
       int b = sc.nextInt();
       System.out.println();
        for (int i = 0;i < p.r;i++) {
           for(int j =0;j<p.c;j++){
            if (arr[i][j]==b){
                System.out.println("We found the element "+b+" at index "+"("+i+","+j+")");
            }


           }
            
        }
    }


       }
