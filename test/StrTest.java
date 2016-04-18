package test;

public class StrTest
{
	public static void main(String[] args)
	{
		StringBuffer a=new StringBuffer("A");
		StringBuffer b=new StringBuffer("B");
	/*	operate(a,b);
		b=a;*/
		System.out.println();
		
		String str1="abc";
		String str2=new String("abc");
		System.out.println(str1==str2.intern());
		
	}
	public static void operate(StringBuffer x, StringBuffer y)
	{
		x.append(y);
		y=x;
	}

}
