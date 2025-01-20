import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q, a, b, n;
        q = scanner.nextInt();
        if(q >= 0 && q <= 500){
            int temp  = 1;
            while(temp <= q){
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    n = scanner.nextInt();
                    if(a >= 0 && a <= 50 && b >= 0 && b<= 50 && n >= 1 && n <= 15){
                        int result = 0;
                        result = a;
                        for(int i = 1; i <= n; i++){
                            result += (int) (Math.pow(2, (i - 1)) * b);
                            System.out.print(result + " ");
                        }
                        temp++;
                        System.out.println();
                    }
            }
        scanner.close();
        }
    }
}