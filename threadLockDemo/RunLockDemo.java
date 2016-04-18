package threadLockDemo;

public class RunLockDemo 
{
	public static void main(String[] args) 
	{
		ResourceLock res=new ResourceLock();
		
		ProducerLock pl=new ProducerLock(res);
		ConsumerLock cl=new ConsumerLock(res);
		
		Thread t1=new Thread(pl);
		Thread t2=new Thread(pl);
		Thread t3=new Thread(cl);
		Thread t4=new Thread(cl);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
