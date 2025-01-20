// import java.io.*;
import java.util.*;

public class Solutions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print top bar
        System.out.println("================================");

        // Process each line of input
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            // Extract string and integer from each line
            String str = parts[0];
            int num = Integer.parseInt(parts[1]);

            // Format and print output
            System.out.printf("%-15s%03d\n", str, num);
        }

        // Print bottom bar
        System.out.println("================================");

        sc.close();
    }
}