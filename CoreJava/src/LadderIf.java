import java.util.Scanner;

public class LadderIf {
public static void main(String[] args) {
	int rno,s1,s2,s3,total;
	double per;
	String sname;
	
	Scanner sc=new Scanner(System.in);
	System.out.print(" Enter Student Name : " );
	sname=sc.next();
	System.out.println("Enter roll no : ");
	rno=sc.nextInt();
	System.out.println("Enter marks of subject 1 : ");
	s1=sc.nextInt();
	System.out.println("Enter marks of subject 2 : ");
	s2=sc.nextInt();
	System.out.println("Enter marks of subject 3 : ");
	s3=sc.nextInt();
	
	total=s1+s2+s3;
	per=total/3;
	System.out.println("percentage : "+per);
	if (per>=70)
	{
		System.out.println("Distinction");
	}
	else if (per>=60)
	{
		System.out.println("first class");
	}
	else if (per>=50)
	{
		System.out.println("second class");
	}
	else if(per>=40)
	{
		System.out.println("pass class");
	}
	else
	{
		System.out.println("fail");
	}
	
	
}
}
