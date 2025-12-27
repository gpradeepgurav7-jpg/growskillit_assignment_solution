package assignment;
import java.util.Scanner;

public class loop_asignment3_evenodd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = in.nextInt();
		in.close();
		
		int evencount=0;
		int oddcount=0;
		int tempNum =num;
		
		while(tempNum > 0) {
			int digit =tempNum %10;
			if (digit %2 ==0) {
				evencount++;
		
		}  else {
				oddcount++;
			}
			tempNum=tempNum / 10;
				
		}
		
		System.out.println("Number of even digits in " + num + ": " + evencount);
		System.out.println("\"Number of odd digits in" + num + " :" + oddcount);
				
	        	
		

	}
}


