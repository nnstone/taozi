package arithmetic;

import java.util.Scanner;

public class PalPromoteDemo
{
	public int isPal(String str)
	{
		int len=str.length();
		//int maxlen=0;
		char[] temp=str.toCharArray();
		int i=0,j=len-1;
		while(i<=j)
		{
			if(temp[i]==temp[j])
			{
				i++;
				j--;
			}
			else
				return 0;
		}
		return len;
	}
	public String getsubStr(boolean[] flag,String str, int len,int start)
	{
		int maxlen;
		String subStr="";
		for(int i=0;i<len;i++)
		{
			if(flag[i]==true)
			{
				subStr+=str.charAt(i);
			}
			maxlen=isPal(subStr);
		}
		return subStr;
	}
	public String getStr(String str,int len)
	{
		boolean[] flag=new  boolean[len];
		int start=0;
		int maxlen=1;
		String subStr;
		for(int i=0; i<len; i++)
		{
			flag[i]=true;
		}
		
		if(start==len)
		{
			
		}
		else
		{
			while(start<len)
			{
			  subStr=getsubStr(flag,str,len,start);
			  maxlen=isPal(subStr);
			  
				start++;
			}
		}
			
		return null;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		int len=str.length();
	}

}
