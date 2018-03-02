package training;
class GokilaTest{
	public static void main(String[] args){
	
		System.out.println("#1");
		System.out.println(sleepIn(false, true));
		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(true, true));
		System.out.println();
		
		
		System.out.println("#2");
		System.out.println(monkeyTrouble(false, true));
		System.out.println(monkeyTrouble(false, false));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(true, true));
		System.out.println();


		System.out.println("#3");
		System.out.println(sumDouble(1, 2));
		System.out.println(sumDouble(3, 2));
		System.out.println(sumDouble(2, 2));
		System.out.println();
		

		System.out.println("#4a");
		System.out.println(diff21(19));
		System.out.println(diff21(11));
		System.out.println(diff21(21));
		System.out.println(diff21(22));
		System.out.println();



		System.out.println("#4b");
		System.out.println(parrotTrouble(true,6));
		System.out.println(parrotTrouble(true,7));
		System.out.println(parrotTrouble(true,21));
		System.out.println(parrotTrouble(false,6));
		System.out.println();

		System.out.println("#5");
		System.out.println(makes10(10,6));
		System.out.println(makes10(1,9));
		System.out.println(makes10(3,10));
		System.out.println(makes10(2,3));
		System.out.println();

		System.out.println("#7");
		System.out.println(posNeg(1, -1, false));
		System.out.println(posNeg(-1, 1, false));
		System.out.println(posNeg(-1, -1, true));
		System.out.println(posNeg(1, 1, true));
		System.out.println();

		//System.out.println("#8");
		//System.out.println(notString("good"));
		//System.out.println(notString("A"));
		//System.out.println(notString("not bad");
		
		//System.out.println();


		System.out.println("#11");
		System.out.println(or35(6));
		System.out.println(or35(25));
		System.out.println(or35(22));
		System.out.println();

		System.out.println("#14");
		System.out.println(icyHot(-1,120));
		System.out.println(icyHot(120,-6));
		System.out.println(icyHot(1,3));
		System.out.println();

		System.out.println("#15");
		System.out.println(in1020(12,99));
		System.out.println(in1020(21,12));
		System.out.println(in1020(8,99));
		System.out.println();

		System.out.println("#16");
		System.out.println(hasTeen(13,20,10));
		System.out.println(hasTeen(21,19,10));
		System.out.println(hasTeen(8,99,7));
		System.out.println();

		/*System.out.println("#10");
		System.out.println(frontBack("code"));
		System.out.println(frontBack("hi"));
		System.out.println(frontBack("XYZ"));
		System.out.println();*/


		
		
	}
	
	
	public static boolean sleepIn(boolean weekday, boolean vacation)
	{
		if(!weekday || vacation){
			return true;
		}
		return false;
			
	}
	
	

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		if((aSmile && bSmile) || (!aSmile && !bSmile)){
			return true;
		}
		return false;
			
	}
	
	


	public static int sumDouble(int a,int b)
	{
		
		if(a==b)
		{
		int c=(a+b)*2;
		return c;
		}
		int d=a+b;
		return d;	
	}




	public static int diff21(int n)
	{
		
		if(n<=21)
		{
		int c=21-n;
		return c;
		}
		int d=(n-21)*2;
		return d;	
	}

	public static boolean parrotTrouble(boolean talk, int hour)
	{
		if((hour>=0) && (hour<=23)){
		if(talk && (hour<7 && hour <20))
		{
		return true;
		}
		}
		
		return false;
			
	}

	public static boolean makes10(int a, int b)
	{
		
		if(a==10 || b==10 || (a+b)==10){
		return true;
		}
	
		return false;	
	}

	public static boolean posNeg(int a, int b, boolean Negative)
	{
		
		if((a>=0 && b>=0)|| (a<0 && b<0 && !Negative)){
		return false;
		}
	
		return true;	
	}

	/*public static String notString(String s)
	{
		
		if(s.equals(not)){
		return s;
		}

		return new String			
	}*/



	/*public static String frontBack(String s)
	{
		
		
		char[] c=s.toCharArray();
		char[] a=new char[1];
		

		for(int i=0;i<c.length;i++)
			{{
			c[0]=a[0];
			c[0]=c[c.length-1];
			c[c.length-1]=a[0];
			}
			return new String c[i];
			}
		
			
		
		}
	
			
	}*/

	public static boolean or35(int a)
	{
		
		if(a>=0) {
		int b=a%3;
		int d=a%5;
			if(b==0 || d==0){
			return true;
			}
		return false;
		}
	
		return true;	
	}
	public static boolean icyHot(int a,int b)
	{
		
		if(((a<0)&&(b>100)) || ((a>100) && (b<0))){
			return true;
			}
		return false;
		
		
	}


	public static boolean in1020(int a,int b)
	{
		
		if(((a>=10)&&(a<=20)) || ((b>=10) && (b<=20))){
			return true;
			}
		return false;
		
		
	}

	public static boolean hasTeen(int a,int b,int c)
	{
		
		if(((a>=13)&&(a<=19)) || ((b>=13) && (b<=19)) || ((c>=13) && (c<=19))){
			return true;
			}
		return false;
		
		
	}


}