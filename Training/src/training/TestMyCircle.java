package training;
import com.audex.shapes.MyCircle;
import com.audex.shapes.MyPoint;

public class TestMyCircle {

	public static void main(String[] args){
	MyCircle circle1 = new MyCircle();	
	MyCircle circle2 = new MyCircle(10,20, 50);
	
	MyPoint myPoint = new MyPoint(5,5);
	MyCircle circle3 = new MyCircle(myPoint, 9);
	
	System.out.println(circle1);
	System.out.println(circle2);
	System.out.println(circle3);
	
	System.out.println(circle2.distance(circle3));

circle1.setCenterXY(10, 20);
System.out.println(circle1.toString());
	
for(int i=20; i<=25;i++){
	circle1.setCenterY(i);
	System.out.println(circle1);
}
	}
	
}
