public class VarScope 
{
    static int x ;
    public static void main(String[] args)
    {
        x = 10;
        System.out.println("main x : " + x);
        myMethod();
        
    }
    public static void myMethod() {
        int y;
        y = 15;
        if ( y == x+5)
        {
            int z;
            z = 20;
            System.out.println("myMethod: z = " + z);

        }
        System.out.println("myMethod : x = " + x);
        System.out.println("myMethod : y = " + y );

    }
}
/*public class VarScope
 { 
    static int x;
    public static void main(String[] args)
    {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }
    public static void myMethod()
    {
        int y;
        y = 10; 

        if (y == x + 5)
        { 
            int z;
            z = 15;
            System.out.println("myMethod: z = " + z);
        } 
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    } 
}*/