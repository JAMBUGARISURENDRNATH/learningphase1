package ArrayProg;

public class Product 
{
	int id;
	String name;
	int count;
	String category;
	int price;
	
	
	void display(int x,String y)
	{
		System.out.println("The id  is:"+x + "the name is :"+y);
	}
	void display1(int c,int p)
	{
		int total=0;
		total=c*p;
		System.out.println("the total cost was:"+total);
	}
	void totaldis(int id,String name,String category)
	{
		System.out.println("the id was:"+id+" "+"the name was:"+name+" "+"the category of product is :"+category);
	}
	public static void main(String[] args)
	{
		A a1=new A();
		a1.display(50, "butter");
		B b1=new B();
		b1.display(90, "Milk");
		C c1=new C();
		c1.display(56, "choco");
		SubA a2=new SubA();
		a2.display1(50, 30);
		SubB a3=new SubB();
		a3.display1(90, 10);
	}
}
class A extends Product
{

}
class SubA extends A
{
}
class B extends Product
{
}
class C extends Product
{
}
class SubB extends B 
{
}