abstract class RBI
{
	abstract void roi(double r);
}
class SBI extends RBI
{
	void roi(double r) {
		System.out.println(" Rate of interest by SBI is : "+r);
	}
}
class ICICI extends RBI
{
	void roi(double r) {
		System.out.println(" Rate of interest by ICICI is : "+r);
	}
}
class HDFC extends RBI
{
	void roi(double r) {
		System.out.println(" Rate of interest by HDFC is : "+r);
	}
}
public class AbstractClass{
	
 public static void main(String[]args) {
	SBI s=new SBI();
	ICICI i=new ICICI();
	HDFC h=new HDFC();
	
	s.roi(6.3);
	i.roi(5.0);
	h.roi(7.1);
}
}
