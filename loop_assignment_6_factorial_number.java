package assignment_one;

public class loop_assignment_6_factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=6;
		 int fact=1;
		for(int i=1;i<=Number;i++)
			fact=fact *i;
		{
			System.out.println(fact);
			
			int num=14351;
			
			System.out.println(num);
			int reverse=0;
			while(num>0)
			{
				int lastdigit=num%10;
				reverse=reverse*10+lastdigit;
				num=num/10;
						
			}
			System.out.println(reverse);
			}
		
		

	}

}
