
/*This keyword
"this" it is used to refer the current object inside a method or constructor
1. First we are using this to show that this constructor shows the same unique id of the class (current object of the class)
2. When the local var and instance var is same in a method or class JVM get confused so this.var refers to the current object (instance var)
3. We can also use it to call default constructor of its own class

 */

class thisPrac {

  /*
    //for 1. & 2. only
   * int a;
   
   */
 /*
//for 1 & 2/
    thisPrac(int a) {
       
        // 2.
        a = a;
         */
        /*
        //after using this
        this.a = a;
        // now here it took the arguemnt we passed as this.a because it is the
        current
        // instance var
        

    }

    // Here we will create a method which will show the reference id of 'this' also
    void show() {
/*        
        // 1. 
        System.out.println(this);
        // 2. 
        System.out.println(a);
        

 */     
//3.
thisPrac() {
    System.out.println("This is default constructor");
}
thisPrac(int a){
   //this line is calling the default constrctor
   //3.1 if we comment this this line only 
   //this(); 
    System.out.println(a); 
}
public static void main(String[] args) {
        /*
        //1----------------------------------------
        thisPrac r = new thisPrac();
        // by this r is refering to the refernce id of A
        // and also 'this' itself is refering to its refernce id
        System.out.println(r);
        r.show();
        // calling the function void to display the reference id of the this which
        //soteres the same ref id
         */

        /*
        //2---------------------------------------------------
        thisPrac r = new thisPrac(10);
        //for now when we didn't used the this keyword it won't take the 10 value it
        //will give 0 as output
        r.show();
        //now we used this keyword and we got ouput 10
         */


         //3-------------------------------
         thisPrac r = new thisPrac(100); 

    }
}
