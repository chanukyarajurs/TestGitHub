package training;

class Exam
{
public static void main(String args[])
{
	System.out.println("---#1---");
	System.out.println(sleepIn(false,false));
	System.out.println(sleepIn(true,false));
	System.out.println(sleepIn(false,true));
	System.out.println(sleepIn(true,true));

	System.out.println("---#2---");
	System.out.println(monkeytrouble(false,false));
	System.out.println(monkeytrouble(true,false));
	System.out.println(monkeytrouble(false,true));
	System.out.println(monkeytrouble(true,true));

	System.out.println("---#3---");
	System.out.println(sumDouble(1,3));
	System.out.println(sumDouble(4,3));
	System.out.println(sumDouble(5,5));

	System.out.println("---#4a---");
	System.out.println(diff(17));
	System.out.println(diff(21));
	System.out.println(diff(25));

	System.out.println("---#4b---");
	System.out.println(parrotTrouble(true,6));
	System.out.println(parrotTrouble(false,6));
	System.out.println(parrotTrouble(true,23));
	System.out.println(parrotTrouble(false,7));
	System.out.println(parrotTrouble(true,15));

	System.out.println("---#5---");
	System.out.println(makes(1,9));
	System.out.println(makes(9,9));
	System.out.println(makes(9,10));

	System.out.println("---#7---");
	System.out.println(posNeg(-1,-1,false));
	System.out.println(posNeg(-1,1,false));
	System.out.println(posNeg(1,1,false));
	System.out.println(posNeg(-5,1,false));

	System.out.println("---#11---");
	System.out.println(nonNegative(7));
	System.out.println(nonNegative(5));
	System.out.println(nonNegative(12));
	System.out.println(nonNegative(17));

	System.out.println("---#14---");
	System.out.println(icyHot(120,-1));
	System.out.println(icyHot(-1,120));
	System.out.println(icyHot(2,120));

	System.out.println("---#15---");
	System.out.println(betweenten(12,99));
	System.out.println(betweenten(21,12));
	System.out.println(betweenten(9,99));

	System.out.println("---#16---");
	System.out.println(teen(13,55,66));
	System.out.println(teen(11,10,9));
	System.out.println(teen(3,16,22));
	System.out.println(teen(5,6,18));

}
//---#1---
public static boolean sleepIn(boolean weekday, boolean vacation)	
{
	if(!weekday || vacation)
	{
		return true;
	}
	else
	{
		return false;
	}
}

//---#2---
public static boolean monkeytrouble(boolean aSmile, boolean bSmile)
{
	if(aSmile==bSmile)
	{
		return true;
	} 
	else
	{
		return false;
	}
}
//---#3---
public static int sumDouble(int a, int b)
{
	if(a!=b)
	{
		return a+b;
	}
	else
	{
		return 2*(a+b);
	}
}
//---#4a---
public static int diff(int n)
{
int x;
	if(n<=21)
	{
	x=21-n;
	return x;
	}
	else
	{
	x=n-21;
	x=2*x;
	return x;
	}
}
//---#4b---
public static boolean parrotTrouble(boolean talking,int c)
{
	if(talking && (c<7||c>20))
	{
		return true;
	}
	else
	{
		return false;
	}

}

//---#5---
public static boolean makes(int g, int h)
{
int y;
	y=g+h;
	if((g==10||h==10)||(y==10))
	{	
	return true;
	}
	else
	{
		return false;
	}

}
//---#7---
public static boolean posNeg(int p, int q,boolean r)
{
	if((p<0) || ((q>=0)&&(q<=-32455)))
	{
		return true;
	}
	else
	{
		return false;
	}
}
//---#8---
//---#9---
//---#10---
//---#11---
public static boolean nonNegative(int z)
{
	if((z%3==0)||(z%5==0))
	{
		return true;
	}
	else
	{
		return false;
	}
}
//---#12---
//---#13---
//---#14---
public static boolean icyHot(int u, int i)
{
	if((u<0)||(u>100)&& ((i<0) || (i>100)))
	{
		return true;
	}
	else
	{
		return false;
	}
}
//---#15---
public static boolean betweenten(int k,int m)
{
	if(((k>10) && (k<20)) || ((m>10) && (m<20)))
	{
		return true;
	}
	else
	{
		return false;
	}

}
//---#16---
public static boolean teen(int v, int l, int f)
{
	if(((v>=13) && (v<=19)) || ((l>=13) && (l<=19)) || ((f>=13) && (f<=19)))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}