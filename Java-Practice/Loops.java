 public class Loops
 {
    public static void main(String[] args)
    {   ScannerClass y = new ScannerClass();
        int number = 0 ;
        
        while (true)
{
        System.out.println(number +  " ");
        System.out.print("Do you want to keep counting? " + " (Y or N)");
        String r= y.inputTaker();
        if (r.equals("N"))
        {
            break; // takes you out of the loop  by breaking the loop

            //while on the other hand continue will just skip the part of the experssion and continue the loop without the exp 
        }        
        number +=2;
        
}
        System.out.println("\n Whew... bachgya!");
  
    }

}