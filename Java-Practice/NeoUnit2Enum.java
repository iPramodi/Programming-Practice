import java.util.*;
public class NeoUnit2Enum{
    public enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase();
    Day thisDay = Day.valueOf(s);
    /*
     * oridnal gives the enum's element index
     * values() gives the array of the same datatype of enum element
     * 
     */
    //This will give us the next day's index 
   
    try {
         int a = (thisDay.ordinal()+1)%Day.values().length;

    
    Day nDay = Day.values()[a];       //This will index out the next element from enum array
        System.out.println(nDay);
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid Day.");
    }
   


    }
}