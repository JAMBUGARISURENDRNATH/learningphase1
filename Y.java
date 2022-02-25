package package3;

import package2.M;
import package2.N;
public class Y extends N
{
	public static void main(String[] args) 
	{
		//calling all variables of class X except the private variable
		X t1=new X();
		System.out.println("the value is :"+t1.n5);
		System.out.println("the value is :"+t1.n6);
		System.out.println("the value is :"+t1.n7);
		
		
		//caling all methods from class N except method m7
		N t2=new N();
		t2.m5();
		N t3=new Y();
		Y t4=new Y();
		t4.m8();
		
		System.out.println("");
		M s1=new M();
		s1.m1();
		
	}

}