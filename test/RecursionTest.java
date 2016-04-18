package test;

public class RecursionTest 
{
	public void combine(boolean[] test, int pos,int n)
	{
		/*
		 * using namespace std;
		int n = 4;
		void combine(string str, int pos)
		{
		    if(pos == n)
		        cout << str << endl;
		    else
		    {
		        combine(str + '0', pos + 1);
		        combine(str + '1', pos + 1);
		    }
		}

		int main()
		{
		    
		    string str;
		    combine(str, 0);
		    
		    return 0;
		}*/
	}
	public static void main(String[] args) 
	{
		RecursionTest rt=new RecursionTest();
		boolean[] test=new boolean[4];
		for(int i=0; i<4; i++)
		{
			test[i]=true;
		}
		rt.combine(test,0,4);
	}

}





/*if(pos==n)
{
	for(int i=0;i<n;i++)
	{
		System.out.print(test[i]+"\t");
	}
	System.out.println();
}
else
{
	test[pos]=true;
	combine(test,pos+1,n);
	for(int i=0;i<n;i++)
	{
		System.out.print(test[i]+"\t");
	}
	System.out.println();
	test[pos]=false;
	combine(test,pos+1,n);
	for(int i=0;i<n;i++)
	{
		System.out.print(test[i]+"\t");
	}
	System.out.println();
}*/
 