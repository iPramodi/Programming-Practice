

public class Adv_Pattern {
    public static void Butterfly(){
        int space,i,n;
        n=5;
        
        for(i=1;i<=n;i++) 
          {
          
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            //spaces
            space =2* (n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
            System.out.print(" *");
            }
            System.out.println();

        }
       for(i=n;i>=1;i--){
        space = 2*(n-i);
        for(int j=1;j<=i;j++){
        System.out.print(" *");
        }
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" *");
        }
        System.out.println();
       }

        
    }
    public static void Rhombus_solid(){
        int i,n,space;
        n=5;
        for(i =1;i<=n;i++){
        space = n-i;
            for(int j=space;j>=1;j--){
                System.out.print("  ");
            }
             for(int j=n;j>=1;j--){System.out.print(" *");}
            System.out.println();
         }
           
        }
        public static void No_pyramid() {
            int i,n=5;
            for(i=1;i<=n;i++){
                int space = n-i;
                for(int j=1;j<=space;j++){               //printing spaces
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){      //for printing numbers
                    System.out.print( i+" ");
                }
                System.out.println();
            }
        }
        public static void Palindrom_pyramid() {
            int i,space,j,n;
            n=5;
            for(i =1;i<=n;i++){
                space = n-i;
                for(j=space;j>=1;j--){ //for spaces before the reverse numbers
                    System.out.print("  ");
                }
                for(j =i;j>=1;j--){  //for reverse numbers
                    System.out.print(j+" ");
                }
                for(j=2;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        public static void Diamond(){
            int i,j,space,k,n;
            n=5;
            for(i=1;i<=n;i++) {
                space = n-i;
                k = (2*i)-1; 
                for(j=space;j>=1;j--) {
                    System.out.print("  ");

                }  
                for(j=1;j<=k;j++){
                    System.out.print(" *");
                }          
                System.out.println();  
            }
            for(i=n;i>=1;i--) {
                space = n-i;
                k = (2*i)-1; 
                for(j=space;j>=1;j--) {
                    System.out.print("  ");

                }  
                for(j=1;j<=k;j++){
                    System.out.print(" *");
                }          
                System.out.println();  
            }
        }
 
   
    public static void main(String[] args) {
        Diamond();
    }
    

}