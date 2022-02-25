package assign.questions;
public class StringOpera2
{
	String word1;
	public static void main(String[] args)
	{
		StringOpera2 s1=new StringOpera2();
		s1.formNewWord("Dinga For In Gang");
		
	}
	void formNewWord(String w)
	{
		String word1 = " " + w.charAt(0);
	       int len = w.length();
	       
	       for (int i = 0; i < w.length()-1; i++)
	       {
	           char c = w.charAt(i);
	           if (c == ' ')
	           {
	        	   word1 += w.charAt(i + 1);
	           }
	       }
	       System.out.println("the new word formed is:"+word1);
	 }
}
