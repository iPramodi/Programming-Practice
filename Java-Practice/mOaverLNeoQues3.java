import java.util.*;


class PrimeFibonacciChecker{

  private int numberInput, startInput,endInput;
   private  String typeInput;
    public void  PrimeFibonacciChecker(int numberInput, String typeInput){
        this.numberInput = numberInput;
        this.typeInput = typeInput;

    }
    public void PrimeFibonacciChecker(int startInput,int endInput,String typeInput){
        this.startInput = startInput;
        this.endInput = endInput;
        this.typeInput = typeInput;

    }
    public void PrimeFibonacciChecker(int numberInput, String typeInput){
        if(numberInput == )
    }
}

public class mOaverLNeoQues3 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
    
            String typeInput;
            if (parts.length == 1) {
                typeInput = scanner.nextLine();
                int numberInput = Integer.parseInt(parts[0]);
                new PrimeFibonacciChecker(numberInput, typeInput);
            } else if (parts.length == 2) {
                typeInput = scanner.nextLine();
                int startInput = Integer.parseInt(parts[0]);
                int endInput = Integer.parseInt(parts[1]);
                new PrimeFibonacciChecker(startInput, endInput, typeInput);
            } else {
                System.out.println("Invalid input format.");
            }
    
            scanner.close();
        }
    }
    
}