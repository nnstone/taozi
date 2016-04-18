package exercise;

import java.util.Scanner;

public class PrintSerMat
{
	public void print(int n)
	{
		int[][] matrix=new int[n][n];
		int i,j,k=0;
		int temp=1;
		if(n==2)
		{
			matrix[0][0]=temp++;
			matrix[0][1]=temp++;
			matrix[1][1]=temp++;
			matrix[1][0]=temp++;	
		}
		for(i=0; i<n/2; i++)
		{
			for(j=k; j<n-k; j++)
			{
				matrix[k][j]=temp++;
			}
			for(j=k+1;j<n-k;j++)
			{
				matrix[j][n-1-k]=temp++;
			}
			for(j=n-k-2;j>=k;j--)
			{
				matrix[n-1-k][j]=temp++;
			}
			for(j=n-k-2;j>k;j--)
			{
				matrix[j][k]=temp++;
			}
			k++;
		}
		if(n%2==1)
			matrix[n/2][n/2]=temp;
		for(i=0; i<n; i++)
		{
			for(k=0;k<n; k++)
				System.out.print(matrix[i][k]+"\t");
			System.out.println();
		}
			
	}
	public static void main(String[] args)
	{
		PrintSerMat psm=new PrintSerMat();
		Scanner sc=new Scanner(System.in);
		int n;
		if(sc.hasNext())
		{
			 n=sc.nextInt();
			 psm.print(n);
		}
			
	}

}
