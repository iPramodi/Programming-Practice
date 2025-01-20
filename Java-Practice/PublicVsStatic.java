public class PublicVsStatic {
    static void myStaticMethod() {  
        System.out.println("This is the Static Method")
        ; 
        
    }
    public void myPublicMethod(){
        System.out.println("This is the Public method");
    }

    public static void main(String[] args){
        PublicVsStatic P = new PublicVsStatic(); //First we have to create the object of the main class to use public method
        P.myPublicMethod();
//No need to creat an object
        myStaticMethod();
    }
}
