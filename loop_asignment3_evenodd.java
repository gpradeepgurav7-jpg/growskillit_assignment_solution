package assignment_one;
public class loop_asignment3_evenodd {

	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		int num =12300005;
		while(num > 0) {
			int lastdigit =num %10;
			if (lastdigit %2 ==0) 
				evencount++;
		  else 
				oddcount++;
			num=num / 10;		
		}
		System.out.println("Number of even digits in: " + evencount);
		System.out.println("Number of odd digits in:" + oddcount);
	}
}


