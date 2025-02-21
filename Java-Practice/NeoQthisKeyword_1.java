
import java.util.Scanner;

class IncrementalCounter {
    private int numIncrements;
    public IncrementalCounter(){
        this.numIncrements =0;
       increment();


    }
    public int increment(){
        return ++numIncrements;
    }
    public int getCount(){
        return numIncrements-1;

    }
}
public class NeoQthisKeyword_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IncrementalCounter counter = new IncrementalCounter();
        int numIncrements = scanner.nextInt();
        for(int i=0;i<numIncrements;i++){
            counter.increment();

        }
        System.out.println("Final Count: " + counter.getCount());
    }
    
}
