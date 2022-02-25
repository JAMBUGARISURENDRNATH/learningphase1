package assign1;
public class Student
{
	String name;
	int age;
	char sec;
	char gen;
	int sub1=0;
	int sub2;
	int sub3;
	int sum;
	double avg;
	public Student(String name,char sec,char gen,int sub1,int sub2,int sub3)
	{
		this.name=name;
		this.sec=sec;
		this.gen=gen;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	
	public Student(String name,char sec,char gen,int sub2,int sub3)
	{
		this.name=name;
		this.sec=sec;
		this.gen=gen;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	
	public static void main(String[] args) 
	{
		Student s1=new Student("diksha",'A','M',21, 45, 32);
		Student s2=new Student("finna", 'D', 'M',  78, 45);
		Student s3=new Student("deepak", 'C', 'M', 76, 21);
		
		
		System.out.println("stu1 name is :"+s1.name+"stu1 gender is :"+s1.gen+" "+"stu1 section is : "+s1.sec);
		System.out.println("stu1 sub1 marks is :"+s1.sub1+" "+"stu1 sub2 marks is :"+s1.sub2+" "+"stu1 sub3 marks is :"+s1.sub3);
		System.out.println("stu1 sum of marks is:"+s1.sum(21,45,32));
		System.out.println("stu1 percentage is :"+s1.avg(21,45,32));
		System.out.println("");
		System.out.println("stu2 name is :"+s2.name+"stu2 gender is :"+s2.gen+" "+"stu2 section is : "+s2.sec);
		System.out.println("stu2 sub1 marks is :"+s2.sub1+" "+"stu2 sub2 marks is :"+s2.sub2+" "+"stu1 sub3 marks is :"+s2.sub3);
		System.out.println("stu2 sum of marks is:"+s1.sum(0,78,45));
		System.out.println("stu2 percentage is :"+s1.avg(0,78,45));
		System.out.println("");
		System.out.println("stu3 name is :"+s3.name+"stu3 gender is :"+s3.gen+" "+"stu3 section is : "+s3.sec);
		System.out.println("stu3 sub1 marks is :"+s3.sub1+" "+"stu3 sub2 marks is :"+s3.sub2+" "+"stu1 sub3 marks is :"+s3.sub3);
		System.out.println("stu3 sum of marks is:"+s1.sum(0,76,21));
		System.out.println("stu3 percentage is :"+s1.avg(0,76,21));
		System.out.println("");
		
		
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	double avg(int x,int y,int z)
	{
		return (double)((x+y+z)/3);
	}
}