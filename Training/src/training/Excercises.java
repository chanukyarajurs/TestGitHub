package training;

public class Excercises {
public static void fibonacci(){
	int iEnd = 10;
	int n1=0;
	int n2=1;
	int n3;
	System.out.print(n1 + " " + n2);
	for(int i=0;i<iEnd;i++){
		n3=n1+n2;
		System.out.print(" " + n3);
		n1=n2;
		n2=n3;
		
	}
	
	
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci();
	}

}
