  @SuppressWarnings("unused")
  public class StringB {
    //Building String from char array
   
    static void StringBuilderr() {
        char c[] = {'j','a','v','a',' ','i','s',' ','l','a','n','g','u','a','g','e'};

        String s1 = new String(c,2,5);
        @SuppressWarnings("RedundantStringConstructorCall")
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
    //constructing Strig using ASCII
    static void StringCons() {
        byte ascii[] = {65,66,67,68,69,70};
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 2,3);
        System.out.println(s2);
    }
    //Extracting Char from String
    static void CharAtFn(){
        String s = "THis is a demo line in Java";
        char ch = s.charAt(6);
        System.out.println(ch);
    }
    //Extracting Byte from string
    static void ByteExtr() {
        String a = new String();
        a = "This is a new String";
        byte charArray[] = new byte[a.length()];

        charArray = a.getBytes();
        for(byte i:charArray){
          System.out.println(i);
        }
    }


    public static void main(String[] args) {
      //This String constructor
        char chars[] = {'P','r','a','m','o','d'};
        String s = new String(chars,1,2); //Starting Index and after which we have to go (the count)


        System.out.println(s);
        ByteExtr();
        
    }
}