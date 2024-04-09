package homeAssignment;

public class MissingElement {
	
	public static void main(String[] args) {
		
	
	
	 int[] array = {1,4,3,2,8,6,7};
	 
	 int n = array.length + 1;
	 
	 int expectedSum = (n * (n + 1)) / 2; // sum of the natural numbers
	 
	 int actualSum = 0;
	 
	// Calculate the sum of elements in the array
	 
		 for (int i = 0; i < array.length; i++) {
			    int num = array[i];
			    actualSum =actualSum + num;
			}
	 
  // Find the missing element
     int missingElement = expectedSum - actualSum;

     System.out.println("The missing element is: " + missingElement);
 
	}
	
}
	 


