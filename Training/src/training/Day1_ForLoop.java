package training;

public class Day1_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iEnd = 10;
		int i=0;
		for(;;)
		{
			System.out.println(i);
			if(i>=10)
				break;
			i++;
		}
		
		System.out.println("Value of i after loop :" + i);
	}

}
