public class Funtions {
  static  int[] h={0,0,0,'\0'};
       
    public static void GCD(int a,int b){
     
              int y = 0;
      
        @SuppressWarnings("unused")
        int e=1,p = 0;
        for(int i=1;i<=a;i++){
            if((a%i==0) && (b%i==0)){
               
              
               System.out.println(i);
                h[y]=i;
                y++;
            }
      }
      int u = h.length -1;
      for(int j=0;j<=u;j++){
        e = e*h[j];

      }
    
        System.out.println(e);
    }
    public static void main(String[] args){
     
        GCD(50,100);
    }


}