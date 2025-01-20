import java.util.*;
public class Practice {
    static Scanner sc = new Scanner(System.in);
    /*
     * 1. If-Else Practice
    *Question 1: Write a Java program that takes an integer input and prints whether the number is positive, negative, or zero.
    *Question 2: Create a program that checks if a given year is a leap year. Use if-else conditions to print "Leap Year" or "Not a Leap Year".
    *Question 3: Write a program that takes two integers as input and prints the largest of the two using if-else statements (without using the Math.max function).
    
     */
    public static void Question1() {
        
        System.out.println("Give a number to check: ");
        int a = sc.nextInt();
        if (a>0){
            System.out.println("A is +ve");
        }
        else if (a==0) {
            System.out.println("A is Zero");            
        } 
        else {
            System.out.println("A is -ve");
        }
    }
    public static void Question2() {
       
       System.out.print("Is your given year is a leap year ");
       long a = sc.nextInt();
       @SuppressWarnings("The conditional expression is redundant")

       boolean e = (a%4==0)?true:false;
       System.out.println(e);    
    }
    public static void Question3() {
     int a,b;
     System.out.print("Enter  number 1: ");
     a = sc.nextInt();
     System.out.print("Enter number 2: ");
     b = sc.nextInt();
     if (a>b){
        System.out.println("A is greater than B");

     }
     else{
        System.out.println("B is greater than A");
     }
    }
    public static void Question4() {
        for(int i=0;i<15;i++) {
         
           if ( i==13){
           
        }
        else {
         System.out.println(i);
        } 
        }
    }

    public static void main(String[] args) {
        
        Question4();

    }   
}
