package threadLockDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceLock 
{
	private String name;
	private int count=1;
	private boolean flag=false;
	private Lock lock=new ReentrantLock();
	private Condition con_pro=lock.newCondition();
	private Condition con_con=lock.newCondition();
	public void set(String name) throws InterruptedException
	{
		lock.lock();
		try
		{
			while(flag)
				con_pro.await();
			this.name=name+"--------"+count++;
			System.out.println(Thread.currentThread().getName()+".....生产者......"+this.name);
			flag=true;
			con_con.signal();
		}
		finally
		{
			lock.unlock();
		}
		
	}
	public void out() throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!flag)
				con_con.await();
			System.out.println(Thread.currentThread().getName()+".....消费者....."+this.name);
			flag=false;
			con_pro.signal();
		}
		finally
		{
			lock.unlock();
		}
		
	}
}
