import java.util.Scanner;

class Customer
{
    int amountSpent;
    public Customer()
    public int calculateLoyaltyPoints(int amountSpent) {
     
    }
    
}
class PremiumCustomer extends Customer
{
    
}





public class NQU3_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountSpent = scanner.nextInt();
       
        String isPremium = scanner.next().toLowerCase();
        Customer customer;
        if(isPremium.equals("yes"))
        {
            customer = new PremiumCustomer();
        }
        else{
            customer = new Customer();

        }
        int loyaltyPoints = customer.calculateLoyaltyPoints(amountSpent);

        System.out.println(loyaltyPoints);

    }
}