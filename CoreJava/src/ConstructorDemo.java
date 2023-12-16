import java.util.Scanner;

class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=4;
		depth=5;
	}
	Box(double w,double h,double d)
	{
		System.out.println("parameterized constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)
	{
		System.out.println("copy constructor called");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume :"+(width*height*depth));
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		double w,h,d;
		Scanner sc=new Scanner(System.in);
		Box b1=new Box();
		System.out.print("Enter width : ");
		w=sc.nextDouble();
		b1.volume();
		System.out.print("Enter height : ");
		h=sc.nextDouble();
		System.out.print("Enter depth : ");
		d=sc.nextDouble();
		Box b2=new Box();
		b2.volume();
		
		Box b3=new Box(b1);
		b3.volume();
	}
}
