package package3;
import package2.P;
import package2.N;
import package2.M;
public class Z extends M
{
	public static void main(String[] args)
	{
		// calling all methods from class M except method m3
		// calling all methods from class N except method m7 and method m8
		// calling all methods from class P except the methods m11 and method m12
		M m5=new M();
		m5.m1();
		N m6=new N();
		m6.m5();
		X m7=new X();
		System.out.println("");
		Z m10=new Z();
		m10.m1();
		m10.m4();
		System.out.println("");
		
		P p1=new P();
		p1.m9();
		// calling all variables from clas X except n4 as it is private variable
		
		System.out.println(" the vlaue is :"+m7.n5);
		System.out.println(" the vlaue is :"+m7.n6);
		System.out.println(" the vlaue is :"+m7.n7);
	}
}