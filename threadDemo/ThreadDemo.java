package threadDemo;

public class ThreadDemo extends Thread
{
	ThreadDemo(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0; i<60; i++)
		{
			System.out.println(this.getName()+"run************************"+i);
		}
	}
}
