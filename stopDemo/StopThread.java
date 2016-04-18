package stopDemo;

public class StopThread implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"...exception...");
				flag=false;
			}
			System.out.println(Thread.currentThread().getName()+"....run.....");
		}
	}
	
	public void changeFlag()
	{
		flag=false;
	}
}
