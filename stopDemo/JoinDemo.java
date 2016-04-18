package stopDemo;

public class JoinDemo implements Runnable
{
	public void run()
	{
		for(int i=0; i<70; i++)
		{
			System.out.println(Thread.currentThread().getName()+"....."+i);
			Thread.yield();
		}
	}
}
