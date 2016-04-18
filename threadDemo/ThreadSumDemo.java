package threadDemo;


//单独封装，相互不影响
public class ThreadSumDemo 
{
	public static void main(String args[])
	{
		new Thread()
		{
			public void run()
			{
				for(int i=0; i<100; i++)
				{
					System.out.println(Thread.currentThread().getName()+"...."+i);
				}
			}
		}.start();
		
		Runnable r=new Runnable()
				{
					public void run()
					{
						for(int i=0;i<60;i++)
						{
							System.out.println(Thread.currentThread().getName()+"...."+i);
						}
					}
				};
		Thread t=new Thread(r);
	}
}
