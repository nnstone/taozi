
package threadLockDemo;

public class ProducerLock implements Runnable
{
	private ResourceLock res;
	ProducerLock(ResourceLock res)
	{
		this.res=res;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				res.set("��Ʒ");
			}
			catch(InterruptedException e)
			{}
			
		}
	}
}
