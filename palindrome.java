package homeAssignment;


	public class palindrome {
		// 12321 -- If it reversed , the orginial value and reverse value is same then it is palindrome

		public static void main(String[] args) {
		int number = 123212; // by divide the number by 10--> get reminder as last digit
		int output = 0;
		for(int i=number;i>0;i=i/10 ){// initialization, condition, increment/decrement
		//Get the last digit
		int lastDigit = i%10; // 1st 4, 2nd 3, 3rd 2, 4th 1
		output = (output*10)+lastDigit;// 1st (0*10)+4 = 4, 2nd (4*10)+3= 43, 3rd(43*10)+2 =432, 4th (432*10)+1 = 4321
		}
		
		
		if(number == output) {
		System.out.println(number +" is palindrome");
		}else {
		System.out.println(number+" is not a palindrome");
		}

		}

		}



