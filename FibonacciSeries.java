package homeAssignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
        int range = 8;
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= range; ++i) {
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            
            System.out.print(firstTerm + " ");
        }
    }

}
