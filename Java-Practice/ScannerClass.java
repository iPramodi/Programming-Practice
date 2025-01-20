import java.util.Scanner;
//Scanner class also have a function which allow you to check the  user input datatype : sc.hasNextInt();
//CharAt(); function is used to Slice the string index
/*
 * Scanner class have multiple methods
 * scanner.nextLine(); = it takes a string format from the user
 * scanner.next();
 * 
 * 
 */

public class ScannerClass {
    static Scanner sc = new Scanner(System.in);

    public String getUserId(){
        String UserID = sc.nextLine();
        return UserID;
    }

    public String getPassword(){
        String pwd = sc.nextLine();
        return pwd;
    }
    public String inputTaker(){
        String inp = sc.next();
        return inp;

    }
}