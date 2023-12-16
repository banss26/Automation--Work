import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {

	public static void demo()throws ArithmeticException, InputMismatchException,ArrayIndexOutOfBoundsException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X : ");
		x=sc.nextInt();
		if(x>0)
		{
			System.out.println("Square of X is "+(x*x));
		}
		else
		{
			throw new ArithmeticException();
		}
	
	}
	public static void main(String[] args) {
		try {
			demo();
		}catch(Exception e) {
			System.out.println("Exception caught");
		}finally {
			System.out.println("finally called");
		}
	}
}
