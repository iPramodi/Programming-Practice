import java.util.*;

class NumberClassifier {
    int n;
    int[] e, o;
    int countE = 0, countO = 0;

    // Constructor (does not initialize arrays since n is not set)
    NumberClassifier() {
    }

    public void classifyNumbers(int[] arr) {
        n = arr.length; // Set n based on the array length
        e = new int[n]; // Allocate arrays now that we know n
        o = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                e[countE] = arr[i];
                countE++;
            } else {
                o[countO] = arr[i];
                countO++;
            }
        }
    }

    public void printEvenNumbers(int[] arr) {
        for (int i = 0; i < countE; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }

    public void printOddNumbers(int[] arr) {
        for (int i = 0; i < countO; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
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