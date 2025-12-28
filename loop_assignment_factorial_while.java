package assignment_one;

public class loop_assignment_factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=6;
		int i = 1;
		long Fctl=1;
		
		
		while(i<=Number) {
			Fctl=Fctl *i;
		    i++;
		}	
		
		{
			System.out.println("Factorial of given number:"+Fctl);	
			
			}

	}

}
