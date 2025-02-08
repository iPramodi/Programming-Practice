public class StrMan {
    //Strings are actually objects in java And java reacts differently to the strings
    @SuppressWarnings({"StringEquality", "RedundantStringConstructorCall"})
    public static void main(String[] args) {
        String s = "Pramod Devrath";
        String r = "Tony";

        System.out.println(s);//Printing a string

        System.out.println(s.length());
        System.out.println(r.length());
        //now We will be using char at function

        for(int i=0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        //Comparing two strings
        /*
         * it checks three cases
         * 1. S1>S2 --- 2. S2>S1 ---- 3. S1 == S2
         * it calculates the Strings char individually
         * like Pramod & Tony 
         * here Tony is > than Pramod because T comes later and P comes before thus this value is small
         */
        if(s.compareTo("Pramod Devrath")==0){

            System.out.println("They are equal");

        }
        else { 
            System.out.println("NOt equal");

        }
        //Sometimes the comparing method "==" is not usuable because Strings are object and objects are stored differently in java's mem unlike other data types

        if(new String("pramod")==new String("pramod")){
            System.out.println("They are equal");
        }
else {
   System.out.println("Not equal");}

   //We can use a substring also as string.substring(Start index, End index)

   System.out.println(s.substring(3, 9)); //This will give "mod De"
   //if we don't give ending index it take to the end of index
    }   

}//LAst thing strings are immutable
