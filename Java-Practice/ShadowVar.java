public class ShadowVar {
    static int x ;
    public static void main(String[] args){
        x = 10;
        System.out.println("This is main variable: "+x);
        int x;
        // This code won't run because now global var is shadowed and local variable is not defiend yet : 
        //System.out.println("This is main variable: "+x);
        x = 20;
        System.out.println("x = "+x);
        System.out.println("ShadowVar.x = "+ ShadowVar.x);
        //Shadowing is a common source of error so avoid it as much as possible
        

    }
    
}
