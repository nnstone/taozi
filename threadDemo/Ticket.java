package threadDemo;

public class Ticket implements Runnable //extends Thread
{ 
	private int tick=100;
	public void run()
	{
		while(true)
		{
			if(tick>0)
			{
				tick--;
				System.out.println(Thread.currentThread().getName()+"sell"+tick);
			}
		}
	}
	public static void main(String args[])
	{
		Ticket t= new Ticket();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
