import java.util.*;

class GeometryCalculator {
    //Volume of a cube = Side length * Side length * Side length 
    //Volume of a pyramid = (Base * Height) / 3.0
    
    public double calculateVolume(double sideLegth){
        return sideLegth*sideLegth*sideLegth;
        
    }
    public double calculateVolume(double baseArea,double Height){
        return (baseArea * Height) /3.0;
    }


    
}

class NeoQuesU2 {
    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();
        if (shape ==1 ){
            double sideLength = scanner.nextDouble();
            double cubeVolume = calculator.calculateVolume(sideLength);
            System.out.printf("Volume of the cube: %.2f%n",cubeVolume);
        
        }
        else if(shape ==2){
            double baseArea = scanner.nextDouble();
            double height = scanner.nextDouble();
            double pyramidVolume = calculator.calculateVolume(baseArea,height);
            System.out.printf("Volume of the pyramid: %.2f%n",pyramidVolume); 
            
        }
        else {
            System.out.println("Invalid");
        }
        scanner.close();



    }
}
