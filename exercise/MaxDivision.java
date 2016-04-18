package exercise;

import java.util.Arrays;

public class MaxDivision
{
	public int findMaxDivision(int[] A, int n) 
    {
		int[] minus=new int[n-1];
		Arrays.sort(A);
		for(int i=0;i<n-1;i++)
			minus[i]=Math.abs(A[i+1]-A[i]);
		int max=minus[0];
		for(int i=1;i<n-1;i++)
		{
			max=minus[i]>max?minus[i]:max;
		}
		return max;
    }
	public static void main(String[] args)
	{
		MaxDivision md=new MaxDivision();
		int[] A={9,3,1,10};
		int max=md.findMaxDivision(A, 4);
		System.out.println(max);
	}

}
