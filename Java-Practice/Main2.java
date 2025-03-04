import java.util.*;


class NumberClassifier {
    int n;
    int[] e, o;
    int countE = 0, countO = 0;

    // Constructor 
    NumberClassifier() {
        
    }

    // Method to classify numbers into even and odd arrays
    public void classifyNumbers(int[] a) {
        e = new int[n];
        o = new int[n];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                e[countE] = a[i]; // Add to even array
                countE++; // Increment even count
            } else {
                o[countO] = a[i]; // Add to odd array
                countO++; // Increment odd count
            }
        }
    }

    // Method to print even numbers
    public void printEvenNumbers(int[] arr) {
        for (int i = 0; i < countE; i++) { // Print only valid even numbers
            System.out.print(e[i] + " ");
        }
        System.out.println(); // Print newline for better output formatting
    }

    // Method to print odd numbers
    public void printOddNumbers(int[] arr) {
        for (int i = 0; i < countO; i++) { // Print only valid odd numbers
            System.out.print(o[i] + " ");
        }
        System.out.println(); // Print newline for better output formatting
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        NumberClassifier obj = new NumberClassifier();
        obj.n = scanner.nextInt();
        int[] arr = new int[obj.n];
        
        for (int i = 0; i < obj.n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        obj.classifyNumbers(arr);
        obj.printEvenNumbers(arr);
        obj.printOddNumbers(arr);

        scanner.close();
    }
}