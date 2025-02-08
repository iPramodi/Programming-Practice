import java.util.Scanner;

public class hmwrkArr {
    @SuppressWarnings("ConvertToTryWithResources")
public void question1(){
    Scanner var1 = new Scanner(System.in);
    System.out.print("Enter the lenght of the array: ");
    int var2 = var1.nextInt();
    System.out.println();
   String var3[] = new String[var2];
    for(int i = 0;i<var2;i++){
        System.out.print("Enter the "+ (i+1)+"th element: ");
        String var4 = var1.next();
        System.out.println();
        var3[i] = var4;

    }
    for(int i= 0;i<var2;i++){
        System.out.println(var3[i]);
    }
var1.close();
}
public static void problem(){
    @SuppressWarnings("ConvertToTryWithResources")
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lenght of the arrys: ");
    int a = sc.nextInt();
    int[] arr = new int[a];
    for(int i = 0;i<a;i++){
        System.out.print("Enter the elements of array");
        int temp = sc.nextInt();
        System.out.println();
        arr[i] = temp;

    }
    int x,y;
    x = arr[0];
    y= arr[0];
    for(int i = 0;i<a;i++){
        if (x<arr[i]){
            x = arr[i];
             }
        if (y>arr[i]){
            y = arr[i];
        }
    }
    System.out.println("The max value is: "+ x);
    System.out.println("The min value is: "+ y);

    sc.close();

}
public static void problem2() {
    @SuppressWarnings("ConvertToTryWithResources")
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lenght of the arrys: ");
    int a = sc.nextInt();
    int[] arr = new int[a];
    for(int i = 0;i<a;i++){
        System.out.print("Enter the elements of array: ");
        int temp = sc.nextInt();
        System.out.println();
        arr[i] = temp; 
}
sc.close();
int b = arr.length;
//System.out.println(b);
    for(int i = 0;i<(b-1);i++){
        if(arr[i] <= arr[i+i]){
            int temp;
            temp  = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;

        }
       
    
    } for(int u=0;u<arr.length;u++){
        System.out.println(arr[u]);
       
    }
}
    public static void main(String [] args){
        problem2();
       
    }
}