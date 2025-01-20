import java.util.*;
public class palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args){ 
        String o,inp;
        o="";        
        Scanner objC = new Scanner(System.in);
        System.out.print("Enter String to check the palindrome: ");
        inp = objC.next();
        for (int i = inp.length() -1; i>=0;i--) { //As length will give the lenght but the index is always lenght-1 to refer to the exact thing you want to print
                o += inp.charAt(i);
        }       
        if (inp.equals(o)){
            System.out.println("Yes it is");
        }     
        else {
            System.out.println("NO it is not");
        }
    }
}