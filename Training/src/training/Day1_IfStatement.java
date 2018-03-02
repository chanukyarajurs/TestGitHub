package training;

public class Day1_IfStatement {

	public static void main(String[] args) {
		int a = 0;
		int b = 200;
		
		//Simple If
		if (a==b)
			System.out.println("a and b are equal");
		else
			{System.out.println("a and b are not equal");}

		
		//If else statement
		if(a==0)
			System.out.println("Zero");
		else if(a==1)
			System.out.println("One");
		else if(a==2)
			System.out.println("Two");
		else if (a==3)
			System.out.println();
		
		//Nested if
		if(a==0)
		{
			if(b==0)
				System.out.println("A and B are 0");
			if(b==1)
				System.out.println("A=0 and B=1");
			else
				System.out.println("B is greater than 1");
		}
		
		if(false)
			System.out.println("The Condition is True");
		
	}

}
