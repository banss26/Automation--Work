class NewThread implements Runnable
{
	Thread t;
	public NewThread() {
		t=new Thread (this,"Child Thread");
		t.start();
	}
	public void run() {
		try {
			for (int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(700);
			}
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("child thread exiting");
	}
	
}
public class CreatingThread {

	public static void main(String[] args) {
		new NewThread();
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<5;i++)
			{
				System.out.print(t+" : "+i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("main thread exiting");
	}
}
