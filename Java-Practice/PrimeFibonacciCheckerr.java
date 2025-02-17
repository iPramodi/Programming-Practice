import java.util.*;
class PrimeFibonacciChecker {

    // Constructor for checking a single number
    public PrimeFibonacciChecker(int numberInput, String typeInput) {
        if ("prime".equalsIgnoreCase(typeInput)) {
            if (isPrime(numberInput)) {
                System.out.println(numberInput + " is a prime number.");
            } else {
                System.out.println(numberInput + " is not a prime number.");
            }
        } else if ("fibonacci".equalsIgnoreCase(typeInput)) {
            if (isFibonacci(numberInput)) {
                System.out.println(numberInput + " is a Fibonacci number.");
            } else {
                System.out.println(numberInput + " is not a Fibonacci number.");
            }
        } else {
            System.out.println("Invalid type input.");
        }
    }

    // Constructor for checking a range of numbers
    public PrimeFibonacciChecker(int startInput, int endInput, String typeInput) {
        for (int i = startInput; i <= endInput; i++) {
            if ("prime".equalsIgnoreCase(typeInput)) {
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number.");
                }
            } else if ("fibonacci".equalsIgnoreCase(typeInput)) {
                if (isFibonacci(i)) {
                    System.out.println(i + " is a Fibonacci number.");
                }
            } else {
                System.out.println("Invalid type input.");
                break;
            }
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a Fibonacci number
    private boolean isFibonacci(int number) {
        if (number < 0) return false;
        int a = 0, b = 1;
        while (b < number) {
            int temp = b;
            b += a;
            a = temp;
        }
        return b == number;
    }
} 


    public class PrimeFibonacciCheckerr {
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
    
