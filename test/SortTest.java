package test;

public class SortTest
{
	/*********************************—°‘Ò≈≈–Ú********************************/
	public void selectSort(int a[],int n)
	{
		int i,j;
		for(i=0; i<n; i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
					swap(a,i,j);
			}
		}
	}
	/***********************************÷±Ω”≤Â»Î**************************************/
	public void insert(int[] a, int n)
	{
		int i,j;
		for(j=1; j<n; j++)
		{
			int key=a[j];
			i=j-1;
			while(i>=0 && a[i]>key)
			{
				swap(a,i,i+1);
				i--;
			}
			a[i+1]=key;
		}
	}
	/****************************øÏÀŸ≈≈–Ú(∑«µ›πÈ)********************************************/
	public void quickSort(int a[], int s, int t)
	{
		int i=s;
		int j=t;
		if(s<t)
		{
			int temp=a[s];
			while(i!=j)
			{
				while(j>i && a[j]>temp)
					j--;
				if(i<j)
				{
					swap(a,i,j);
					i++;
				}
				while(i<j && a[i]<temp)
					i++;
				if(i<j)
				{
					swap(a,i,j);
					j--;
				}
			}
			a[i]=temp;
			quickSort(a,s,i-1);
			quickSort(a,i+1,t);
		}
	}
	/*********************************øÏÀŸ≈≈–Ú(µ›πÈ)*****************************************/
	public void RecquickSort(int[] a,int p, int r)
	{
		int q;
		if(p<r)
		{
			q=partition(a,p,r);
		    RecquickSort(a,p,q-1);
		    RecquickSort(a,q+1,r);
		}
	}
	
	public int partition(int[] a, int p, int r)
	{
		int x=a[r];
		int i=p-1;
		for(int j=p;j<r;j++)
		{
			if(a[j]<x)
			{
				i=i+1;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		System.out.print(i+"\t");
		for(int m=0; m<=r; m++)
			System.out.print(a[m]+"\t");
		System.out.println();
		return i+1;
	}
	
	
	/*************************√∞≈›≈≈–Ú********************************/
	    public void bubbleSort(int[] a)
	    {
	        for (int i = a.length - 1; i > 0; i--)
	        {
	            for (int j = 0; j < i; j++)
	                if (a[j + 1] < a[j])
	                	swap(a,j+1,j);
	        }
	    }
	    public void shellSort(int a[], int n)
	    {
	    	int i,j,d;
	    	d=n/2;
	    	while(d>0)
	    	{
	    		for(i=d; i<n; i++)
	    		{
	    			j=i-d;
	    			while(j>=0 && a[j]>a[j+d])
	    			{
	    				swap(a,j,j+d);
	    				j=j-d;
	    			}
	    		}
	    		d=d/2;
	    	}
	    }
	
	public void swap(int[] a,int i,int j)
	{
		    int temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
	}
	public static void main(String[] args)
	{
		SortTest st = new SortTest();
		int[] test={4,2,1,6,3,6,0,-5,1,1};
		int n=test.length;
		st.selectSort(test, n);
		//st.insert(test, n);
		//st.bubbleSort(test);
		//st.selectSort(test, n);
		st.quickSort(test,0,n-1);
		for(int i=0; i<n; i++ )
			System.out.print(test[i]+"\t");
	}

}
