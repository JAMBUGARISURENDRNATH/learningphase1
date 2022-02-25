package assign1;

public class MethodOverLoad
{

	public static void main(String[] args) 
	{
		MethodOverLoad ob1=new MethodOverLoad();
		int x1=ob1.add(4, 5);
		double x2=ob1.areaCircle(4);
		int x3=ob1.areaRectangle(5, 2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
	}
	int add(int a, int b)
	{
		return a+b;
	}
	double areaCircle(int radius)
	{
		return 3.14*radius*radius;
	}
	int areaRectangle(int len,int bre)
	{
		return  len*bre;
	}

}