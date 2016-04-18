package arithmetic;

import java.util.Scanner;

public class Transfer
{
	 public static int solution(int n,int t, int c,int arr[])
	    {
	        int sumc=0;
	        int count=0;
	        if(n<c)
	            return 0;
	        else
	        {
	            if(n==c)
	            {
	               sumc=sum(arr,0,n);
	               return sumc>t?0:1;
	            }
	            else if(n>c)
	            {
	                for(int i=0; i<=n-c;i++)
	                {
	                    sumc=sum(arr,i,i+c);
	                    count=count+(sumc>t?0:1);
	                }
	                return count;
	            }
	            return 0;
	        }
	    }
	    public static int sum(int arr[],int x,int y)
	    {
	        int sum=0;
	        for(int i=x;i<y;i++)
	        	sum=sum+arr[i];
	        return sum;
	    }
    public static void main(String args[])
    {
    	 Scanner sc=new Scanner(System.in);
         while(sc.hasNext())
         {
             int n=sc.nextInt();
             int t=sc.nextInt();
             int c=sc.nextInt();
             int[] arr=new int[n];
             for(int i=0; i<n;i++)
                 arr[i]=sc.nextInt();
             System.out.println(solution(n,t,c,arr));
             if(sc.nextInt()==0)
                 break;
         }
         sc.close();
   }
}


/*
 
public class Main
 {
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
	    Main b=new Main();
		while(ss.hasNext())
		{
			int n=ss.nextInt();
			int t=ss.nextInt();
			int c=ss.nextInt();
			int data[]=new int[n];
			for(int i=0;i<n;i++)
			{
				data[i]=ss.nextInt();
			}
			int result=b.number(data, c, t);
			System.out.println(result);
		}
	}
	public int number(int data[],int c,int t)
	{
		int result=0;
		int temp=0;
		if(c==data.length)
		{
			result=1;
		}
		else
		{
			for(int i=0;i<c;i++)
			{
				temp=temp+data[i];
			}
			if(temp<=t)
			{
				result++;
			}
			for(int i=c;i<data.length;i++)
			{
				temp=temp+data[i]-data[i-c];
				if(temp<=t)
				{
					result++;
				}
			}
		}
		return result;
	}

}
 */
/*
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=sc.nextInt();
int c=sc.nextInt();
int[] arr=new int[n];
for(int i=0; i<n;i++)
    arr[i]=sc.nextInt();
sc.close();
System.out.println(n+"\t"+c+"\t"+t+"\t");
for(int i=0; i<n; i++)
	System.out.print(arr[i]+"\t");
int count=solution(n,t,c,arr);
System.out.println(count);*/
