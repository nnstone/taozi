package inherTest;

public class Z extends X
{
	Y y=new Y();
	public Z()
	{
		System.out.println("z");
	}
	public Z(String str)
	{	super("");
		System.out.println("NM");
	}
}
