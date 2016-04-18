package test;

public class TestTo 
{
	public static void main(String[] args) 
	{
		String str="中国A我";
		byte[] b="s".getBytes();
		new TestTo().A(str,4);
	}
	public void A(String str,int i)
	{
		byte[] b=new byte[1024];
		int num=0;
		b=str.getBytes();
		if(b[i-1]>0)
		{
			System.out.println(new String(b,0,i));
		}
		else
		{
			for(int j=0; j<i; j++)
			{
				if(b[j]<0)
				{
					num++;
					num=num%2;
				}
				else
				{
					num=0;
				}
			}
			if(num==0)
			{
				System.out.println(new String(b,0,i));
			}
			else
			{
				System.out.println(new String(b,0,i-1));
			}
		}
	}
}
