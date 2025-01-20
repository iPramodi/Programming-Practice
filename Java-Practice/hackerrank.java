import java.util.Scanner;

public class hackerrank {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int q,a,b,n;
        q = t.nextInt();
        if(q>=0 && q<=500){
            int temp =1;
            while(temp <=q){
                a = t.nextInt();
                b = t.nextInt();
                n = t.nextInt();
                if (a>=0 && b<=50 && n <=15 && n>=0){
                    int result;
                    result =a;
                    for(int i=1;i<=n;i++){
                        result += (int)(Math.pow(2,i-1)*b);
                        System.out.print(result +" ");

                    }


                }
temp++;

            }
        }

t.close();

    }
}