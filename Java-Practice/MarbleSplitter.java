import java.util.Scanner;

public class MarbleSplitter {

    static Scanner marbles = new Scanner(System.in);
    static Scanner children = new Scanner(System.in);

    public static void main(String[] args){
    

    //Making interface
    System.out.println("Welcome to Children's marble Distributer services");
    int Child, marb, marbPerChild, remainMarb;      //Declaring Variables


    System.out.print("Number of Marbles: ");
    marb = marbles.nextInt(); //getting input
    System.out.print("Number of Children: ");
    Child = children.nextInt();
//Caculations and Execution process
    marbPerChild = marb/Child ;
    remainMarb = marb%Child;
    System.out.println("Give each Child " + marbPerChild + " each");
    System.out.println("You will have "+ remainMarb+ " remaing");






    }
}