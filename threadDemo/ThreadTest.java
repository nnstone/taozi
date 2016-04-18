package threadDemo;

public class ThreadTest
{
	public static void main(String[] args) 	
	{
		ThreadDemo td=new ThreadDemo("thread1");
		ThreadDemo td1=new ThreadDemo("thread2");
		td.start();
		td1.start();
		for(int i=0; i<60; i++)
			System.out.println("main run**********************"+i);
	}

}
