public class methodOverloading {
    public int Add(int a, int b){
        return a+b;

    }
    public float Add(double a, double b){
        return (float) (a+b);

    }


    //We can also create a method which Can have unlimited var type inside it that means a method which can have unlimited no. of arguements
    public static int add(int x, int ...arr){ //If we remove int x then we can pass this method without any kind of arguements in it and with int x we restricted it to
       int result =x;
        for(int j: arr){
            result +=j;

        }
        return result;

    }
    public static void main(String[] args) {
     //  methodOverloading a = new methodOverloading();
       //System.out.println(a.Add(5.4, 5));
        System.out.println(add(2,5,6,0));
        //here it forms a 

    }

    
}