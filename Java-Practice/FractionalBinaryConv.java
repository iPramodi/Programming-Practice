// Java program to demonstrate above steps of 
// binary fractional to decimal conversion 

public class FractionalBinaryConv{
	

// Function to convert binary fractional to 
// decimal 
static double binaryToDecimal(String binary, int len) 
{ 
	
	// Fetch the radix point 
	int point = binary.indexOf('.'); 

	// Update point if not found 
	if (point == -1) 
		point = len; 

	double intDecimal = 0, 
		fracDecimal = 0, 
		twos = 1; 

	// Convert integral part of binary to decimal 
	// equivalent 
	for(int i = point - 1; i >= 0; i--) 
	{ 
		intDecimal += (binary.charAt(i) - '0') * twos; 
		twos *= 2; 
	} 

	// Convert fractional part of binary to 
	// decimal equivalent 
	twos = 2; 
	for(int i = point + 1; i < len; i++) 
	{ 
		fracDecimal += (binary.charAt(i) - '0') / twos; 
		twos *= 2.0; 
	} 

	// Add both integral and fractional part 
	return intDecimal + fracDecimal; 
} 

// Driver Code 
public static void main(String[] args) 
{ 
	String n = "110010.0110"; 
	System.out.println( 
		binaryToDecimal(n, n.length())); 

	n = "1001.0010"; 
	System.out.println( 
		binaryToDecimal(n, n.length())); 


		
} 
} 
	
// This code is contributed by dheeraj_2801 
