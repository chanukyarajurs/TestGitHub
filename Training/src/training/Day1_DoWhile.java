package training;

public class Day1_DoWhile {
public static void main(String[] args){
	int i=0;
	do{
		System.out.println(i);
		if(i==5)
			break;
		i++;
	} while(i<10);
}
}
