package assignment_one;

public class If_Else_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=102;
		int num2=48;
		int num3=98;
		if (num1 > num2 & num1 > num3)
		{
			System.out.println("num1 is greatest number:"+num1);
		}
		else if(num2> num3 & num2 > num1)
		{
			System.out.println("num2 is greatest number:"+num2);
		}
		else
			System.out.println("num3 is greatest number:"+num3);
		
	}
}
