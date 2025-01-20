/*
 * Java uses two types of way to use conditions to use java
 * if (exp 1){
 *          "Code"
 *          }
 * Only if can also work in java we don't have to use else statement
 * else {
 *          "code"    
 *    }
 * We can use else like this there is nested if else also
 * 
 * Boolean Operators 
 * !--not        |      ^--XOR
 * &--and        |      &&-- Conditional AND (Only left side bool exp is evaluated) if False direct answer False if not whole expression is evaluated
 * |--or         |       ||-- Conditional OR (Only left side bool exp is evaluated) if True direct answer True if not whole expression is evaluated
 
 */
public class Cond{
      public static void main(String[] args) {
             int a,b,c;
             a = 1;
             b = 4;
             c = 3;
             
            if ((a==1 && b==2) || (c==3)){
                  System.out.println("true");
            
            }
            else 
            System.out.println("Nikal laude");
      }
}