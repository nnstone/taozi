package test;

import java.util.Scanner;
import java.util.Stack;

public class TestE1
{
	static char[] chin1={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
	static char[] unit={'拾','佰','仟'};
	static char[] bigUnit={'万','亿'};
	static char[] chin2={'分','角','元','整'};
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		scan.close();
		StringBuffer sb=new StringBuffer(input);
		System.out.println("您输入的数据是："+input);
		
		String regex1="^([1-9]{1,})([0-9]{0,})\\.([0-9]{2})$";
		String regex2="^([0-9])\\.([0-9]{2})$";
		
		
		if((input.matches(regex1)==true) || (input.matches(regex2)==true) )
		{
			changeTo(sb);
		}
		
		else
			System.out.println("输入数据不合法");
	}
	
	public static void changeTo(StringBuffer sb)
	{
		int n=sb.length();
		Stack<Character> st=new Stack<Character>();
		String str=sb.reverse().toString();
		
		String subStr1=str.substring(0,2);
		
		String subStr2=str.substring(3,n);

		
		char[] behind=subStr1.toCharArray();
		char[] front=subStr2.toCharArray();
		
		int len=front.length;
		
		//System.out.println(behind[1]);
		
		
		if(behind[0]=='0')
		{
			if(behind[1]=='0' )
			{
				st.push(chin2[3]);
			}
			else
			{
				st.push(chin2[1]);
				int temp=(int)behind[1]-48;
				st.push(chin1[temp]);
			}
		}
		else if(behind[0] !='0')
		{
			st.push(chin2[0]);
			int temp=(int)behind[0]-48;
			st.push(chin1[temp]);
			int t=(int)behind[1]-48;
			if(behind[1]=='0')
			{
				st.push(chin1[t]);
			}
			else
			{
				st.push(chin2[1]);
				st.push(chin1[t]);
			}
		}
		
		if((len>1) || ((len==1) && (front[0] !='0')))
			st.push(chin2[2]);
		
		
		int count=0;  //记录连续的0的个数
		int rema=0;   //四个四个分组，记录除以4时的余数
		
		boolean flag1=true;
		boolean flag2=true;
		//boolean flag3=true;
		for(int i=0; i<len;)
		{
			if(front[i]=='0')
			{
				count++;
				i++;
			}
			else
			{
				if(count>0)
				{
					st.push(chin1[0]);	
					if(i-count==0)
						st.pop();
				}	
			count=0;
			rema=i%4;
			if((i>3) && (i<=7) && flag1)
			{
				st.push(bigUnit[0]);
				flag1=false;
			}
			if(i>7 && flag2)
			{
				st.push(bigUnit[1]);
				flag2=false;
			}
			if(rema>0)
				st.push(unit[rema-1]);
			int tt=(int)front[i]-48;
			st.push(chin1[tt]);
			i++;
			}
		}
		
		char[] c={'币','民','人'};
		for(int i=0; i<3; i++)
			st.push(c[i]);
		
		while(!st.isEmpty())
		{
			System.out.print(st.pop());
		}
	}	
}
	
/*	
int x=front.length;
for(int i=0; i<x; )
{
	int count=0;  //记录连续的0的个数
	int rema=0;   //四个四个分组，记录除以4时的余数
	int consult=0; //除以4时的商
	int temp=(int)front[i]-48;
	int j=i;
	while(i==0)
	{
		if(front[j]=='0')
			j++;
		
		i=j;
		consult=i/4;
		rema=i%4;
		if(consult>0)
			st.push(bigUnit[consult-1]);
		if(rema>0)
			st.push(unit[rema-1]);
		int tt=(int)front[i]-48;
		st.push(chin1[tt]);
		i++;
		break;
	}
	while(i>0)
	{
		if(front[j]=='0')
		{
			j++;
		}
			i=j;
			consult=i/4;
			rema=i%4;
			if(consult>0)
				st.push(bigUnit[consult-1]);
			if(rema>0)
				st.push(unit[rema-1]);
			int tt=(int)front[i]-48;
			st.push(chin1[tt]);
		    i++;
	}
}*/

	