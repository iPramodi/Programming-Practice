public class Pattern {
    public static void type1() {
        for(int i=0;i<8;i++){
           
            for(int y=0;y<i;y++) {   
                 System.out.print("*");
        }
            System.out.println("\n");

        }
    }
    public static void type2(){
        for(int i=0;i<5;i++){
            for (int u=i;u<=i;u++){      
                    System.out.print("*");
        }
    }
}
    public static void type3() {
        for(int i=0;i<4;i++){
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
    public static void type4() {
        for(int i = 1;i<=4;i++) {
            for(int j=1;j<=5;j++){ 
                if((i==1 || j==1) ||(i==4 ||j==5)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
           
            }
           System.out.println();
        }
    }
    public static void type5() {
        for (int i=1;i<=4;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void type6(){
        for (int i =1;i<=4;i++ ){
            for(int j =4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void type7() {
        for (int i =1;i<=4;i++){
            for(int j =1;j<=4-i;j++){
                System.out.print(" ");
              
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");
        } System.out.println();
    }
   
    }
  public static int No_pattenr() {
    
    for(int i = 1;i<=5;i++){
        
        for (int j=1;j<=i;j++){
           System.out.print(j+" ");
          
          
        }
        System.out.println();
        

    }
return 0;
    }
    public static void type8(){
        for(int i = 1;i<=5;i++){
                  for(int j =1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
  public static int type9() {
        int a=1,n=5;
        
        for (int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" "); 
                a++;
            }
            System.out.println();
           
        }

        return 0;
    }
    public static void type10(){
        int n,i,j;
        n = 5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2 ==0){
                    System.out.print("1 ");
                    continue;
                }
                if((i+j)%2==1){
                    System.out.print("0 ");
                   
                }
                else{
                    break;
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
      
    type10();

    }

}
