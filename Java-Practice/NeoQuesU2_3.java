import java.util.Scanner;


class PrimeFibonacciChecker{
    
   
        
        // Constructor for checking single number
        public PrimeFibonacciChecker(int number, String type) {
            if (type.equals("prime")) {
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            } else if (type.equals("fibonacci")) {
                if (isFibonacci(number)) {
                    System.out.println(number + " is part of the Fibonacci series.");
                } else {
                    System.out.println(number + " is not part of the Fibonacci series.");
                }
            } else {
                System.out.println("Invalid type specified.");
            }
        }
    
        // Constructor for checking range of numbers
        public PrimeFibonacciChecker(int start, int end, String type) {
            if (type.equals("prime")) {
                List<Integer> primes = new ArrayList<>();
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        primes.add(num);
                    }
                }
                System.out.println("Prime numbers in the range " + start + " to " + end + ": " + primes);
            } else if (type.equals("fibonacci")) {
                List<Integer> fibonacciNumbers = new ArrayList<>();
                for (int num = start; num <= end; num++) {
                    if (isFibonacci(num)) {
                        fibonacciNumbers.add(num);
                    }
                }
                System.out.println("Fibonacci numbers in the range " + start + " to " + end + ": " + fibonacciNumbers);
            } else {
                System.out.println("Invalid type specified.");
            }
        }
    
        // Method to check if a number is prime
        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        // Method to check if a number is part of Fibonacci series
        private boolean isFibonacci(int num) {
            if (num < 0) {
                return false;
            }
            return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
        }
    
        // Method to check if a number is a perfect square
        private boolean isPerfectSquare(int n) {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        }
    }
    


public class NeoQuesU2_3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String typeInput;
        if (parts.length == 1) {
            typeInput = scanner.nextLine();
            int numberInput = Integer.parseInt(parts[0]);
            new PrimeFibonacciChecker(numberInput, typeInput);
        } 
        else if (parts.length == 2) {
            typeInput = scanner.nextLine();
            int startInput = Integer.parseInt(parts[0]);
            int endInput = Integer.parseInt(parts[1]); 
            new PrimeFibonacciChecker(startInput, endInput, typeInput);
        } else             System.out.println("Invalid input format.");
         scanner.close();
    }
   
    }
