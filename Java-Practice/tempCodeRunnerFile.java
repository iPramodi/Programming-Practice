public class Test {
  public static void main(String[] args) {
    DiscountCalculator discountCalculator = new DiscountCalculator();
    double discountedPrice = discountCalculator.calculateDiscountedPrice();
    double amountSaved = discountCalculator.calculateAmountSaved();
    System.out.println("Discounted price : Rs. %.2f%n",discountedPrice);
    System.out.format("Amount saved: Rs. %.2f%n", amountSaved)();
  }  
}