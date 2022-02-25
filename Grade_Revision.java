package assign.questions;
public class Grade_Revision
{
	String name;
	int bas;
	int expn;
	double inc;
	double nbas;	
	public Grade_Revision() 
	{
		name="";
		bas=0;
		expn=0;
		nbas=0.0;
		inc=0.0;
	}
	
	void accept()
	{
		bas=50000;
		expn=3;
		name="pavan";
	}
	void increment()
	{
		if (expn <=3)
		{
			inc = 1000 + (bas * 0.1);
		}
        else if (expn <= 5)
        {
        	inc = 3000 + (bas * 0.12);
        }
        else if (expn <= 10)
        {
        	inc = 5000 + (bas * 0.15);
        }
        else
        {
        	inc = 8000 + (bas * 0.2);
        }
		nbas=bas+inc;
	}
	public void display() 
	{
      System.out.println("the Name is: " + name);
      System.out.println("the Basic is: " + bas);
      System.out.println("the Experience is: " + expn);
      System.out.println("the Increment is: " + inc);
      System.out.println("the New Basic is: " + nbas);
	}
	public static void main(String[] args)
	{
		Grade_Revision o1 = new Grade_Revision();
	      o1.accept();
	      o1.increment();
	      o1.display();
	}
	

}

