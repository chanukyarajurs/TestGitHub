package com.audex.math;

public class MathLib {
	private int temp;
	private int Temp1;
	public int Add(int a, int b){
		temp = a+b;
		return temp;
	}
	
	public int Substract(int x, int y){
		temp  = x-y;
		return temp;
	}
	
	
	public void gettemp1(){
		System.out.println(Temp1);
	}
	public void settemp1(int z)
	{
		Temp1 = z;
}
	

}
