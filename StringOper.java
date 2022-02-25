package assign.questions;
public class StringOper
{
	String name;
	public StringOper()
	{
		name="";
		
	}
	public static void main(String[] args) 
	{
		StringOper s1=new StringOper();
		s1.output("FBSDF BBSJF UU");
	}
	void output(String name)
	{
		int count=0;
		
		for(int i=0;i<name.length()-1;i++)
		{
			if(name.charAt(i)==name.charAt(i+1))
			{
				count++;
			}
		}
		System.out.println("Double Letter Sequence Count = " + count);
	}
}
