package ProConsDemo;

public class RunDemo 
{
	public static void main(String[] args) 
	{
		Resource res=new Resource();
		new Thread(new Producer(res)).start();
		new Thread(new Consumer(res)).start();
		new Thread(new Producer(res)).start();
		new Thread(new Consumer(res)).start();
	}

}
