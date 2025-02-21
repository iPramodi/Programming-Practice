import java.util.Scanner;
class PalindromeChecker{
    private int inputNumber;
    private int t;
    public PalindromeChecker(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public void displayPalindromeCheckResult(){
        if(inputNumber > 9){
            char[] l = String.valueOf(inputNumber).toCharArray();
            for (int i = 0; i < l.length; i++) {  // Check only the first half of the array
                if(l[i] == l[l.length - i - 1]){
                    t++;
                } else {
                    System.out.format("%d is not a palindrome", inputNumber);
                    break;
                }
            }
            if(t == l.length) {
                System.out.format("%d is a Palindrome", inputNumber);
            }
        }
    }
}

public class NeoqThisK_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        PalindromeChecker palindromeChecker = new PalindromeChecker(inputNumber);
        palindromeChecker.displayPalindromeCheckResult();
        scanner.close();
    }
}
