package ConstructorAss2;
public class AreaCalc 
{
	double rad;
	int len;
	int bre;
	int sidelen;
	public AreaCalc()
	{
		System.out.println("calculating area of different shapes");
	}
	public AreaCalc(double radius)
	{
		rad=radius;
		
	}
	public AreaCalc(int len,int bre)
	{
		this.bre=bre;
		this.len=len;
		
	}
	public AreaCalc(int side)
	{
		sidelen=side;
	}
	public static void main(String[] args) throws Exception
	{
		AreaCalc a1=new AreaCalc();
		AreaCalc circle=new AreaCalc(5.6);
		AreaCalc square=new AreaCalc(6);
		AreaCalc rectangle=new AreaCalc(7,2);
		System.out.println("area of square is :"+square.squareArea(square.sidelen));
		System.out.println("area of rectangle is :"+rectangle.rectangleArea(rectangle.bre,rectangle.len));
		System.out.println("area of circle is "+circle.circleArea(circle.rad));
	}
	double circleArea(double x)
	{
		return 3.14*x*x;
	}
	double squareArea(int s)
	{
		return (double)s*s;
	}
	int rectangleArea(int x,int y)
	{
		return x*y;
	}
}