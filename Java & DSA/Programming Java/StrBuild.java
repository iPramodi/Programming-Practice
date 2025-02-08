public class StrBuild {
   public static void main(String[] args) {
    //Creating a new String builder Object
       StringBuilder sb = new StringBuilder("Pramod");

       System.out.println(sb);
       //W can same get the char at indexes with ChatAt
       //We can also use setCharAt(int index, 'char');
       sb.setCharAt(2,'p');
       System.out.println(sb);
       //We can also insert a index

       sb.insert(4, 'P');//here it just put the P just before 4th index
       System.out.println(sb);

       //We can also delete the elemet like sb.delete(st)
   }
}
