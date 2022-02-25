package assign1;
public class StringOperation 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Started Java");
		s1.append("Phase1");
		System.out.println(s1);
		s1.delete(2, 5);
		
		System.out.println(s1); //Sted JavaPhase1
		s1.insert(1, "language");
		System.out.println(s1);
		s1.replace(5, 8, "Python");
		System.out.println(s1);
		System.out.println(s1.reverse());
		char x=s1.charAt(9);
		System.out.println(x);
	}
	
	

}