package threadLockDemo;

public class ConsumerLock implements Runnable
{
	private ResourceLock res;
	ConsumerLock(ResourceLock res)
	{
		this.res=res;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				res.out();
			}
			catch(InterruptedException e)
			{}
		}
		
	}
}
