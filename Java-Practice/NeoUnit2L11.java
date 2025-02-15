import java.util.Scanner;
 class FirstQues {
        int a,b,c;
       Scanner sc = new Scanner(System.in);
       
       
    public Boolean isPythagoreanTriple(){
         Boolean d = (((a*a) == (b*b)+(c*c)) | ((a*a)+ (c*c)== (b*b)) | ((a*a)+ (b*b)==(c*c)));
            return d;


    
      }    }

      class SecondQues {
       
        public void displayTime(int totalSecond){
            int a = totalSecond/3600;
            int b = (totalSecond%3600)/60;
            int c = (totalSecond%60);
            System.out.printf("%02d:%02d:%02d",a,b,c);
        }
    
      }
public class NeoUnit2L11 {
   
    public static void main(String[] args) {
       /*
        *This code is for First question Because I want to Run 2nd question now

        Scanner sc = new Scanner(System.in);
        FirstQues t = new FirstQues();
        
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        t.c = sc.nextInt();
        sc.close();

       System.out.println(t.a);
    
       */
      SecondQues c = new SecondQues();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      c.displayTime(t);
    }

    }