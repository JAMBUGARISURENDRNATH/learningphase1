package package2;

public class P 
{
	public void m9()
	{
		System.out.println("in method m9 of package1");
		m10();
	}
	private void m10()
	{
		System.out.println("in method 10 of package1");
	}
	void m11()
	{
		System.out.println("in method 11 of package1");
	}
	protected void m12()
	{
		System.out.println("in method m12 of package1");
	}
	public static void main(String[] args) 
	{
		M m1=new M();
		N m2=new N();
		System.out.println("value is :"+m1.n3);
		System.out.println("value is :"+m2.n5);
		System.out.println("vlaue is :"+m2.n6);
		System.out.println("vlaue is :"+m2.n7);
	}
}