package stopDemo;

public class JoinRunDemo 
{
	public static void main(String[] args) throws Exception
	{
		JoinDemo jd=new JoinDemo();
		
		Thread t1=new Thread(jd);
		Thread t2=new Thread(jd);
		
		t1.start();
		//t1.join();
		t2.start();
		
		for(int i=0; i<80; i++)
		{
			System.out.println(Thread.currentThread().getName()+"....."+i);
		}
		System.out.println("over");
	}

}
