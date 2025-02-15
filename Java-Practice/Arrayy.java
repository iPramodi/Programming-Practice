public class Arrayy {
    //Methods and Functions are different 
    //Methods are functions  defined in a class and functions are a predefined codes in a block.
    
    public static void main(String[] args) {
        String[] itemS = {"Laptop", "lamp","Bottle"}; //This is how we define a array in Java

        int i = 0;
        int largestWord = 0;
        String word = "";

        while (itemS.length > i){

            int wordLength = itemS[i].length();

            System.out.println(i + ":" + itemS[i] +" " + wordLength);

            if (largestWord<itemS[i].length()) {

                largestWord = itemS[i].length();
                word = itemS[i];

            }
        i++;
        }
        System.out.println("The largest word is " + word + " of lenght "+ largestWord);
    }    
}
