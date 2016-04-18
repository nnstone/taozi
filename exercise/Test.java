package exercise;

import java.util.*;
import java.util.Scanner;
public class Test 
{
	public static void main(String []args)
	{
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
 		while(sc.hasNext())
 		{
 			int i=(int)sc.nextInt();
 			t.print1(i);	
 		}
 	}
 	public static void print1(int n)
 	{
 		int index=0,k=0;
 		int [][]A=new int [n][n];
 		int ttt=1;
 		if(n==2)
 		{
 			A[0][0]=ttt++;
 			A[0][1]=ttt++;
 			A[1][1]=ttt++;
 			A[1][0]=ttt++;
 			for(int h1=0;h1<n;h1++)
 			{
 				for(int h2=0;h2<n;h2++)
 				{
 					System.out.print(A[h1][h2]+" ");
 				}
 			System.out.println();
 			return ;
 			}
 		}
 		for(int i=0;i<n/2;i++)
 		{
 			for(int j1=k;j1<n-k;j1++)
 			{
 				A[k][j1]=ttt++;	
 			}
 			for(int j2=k+1;j2<n-k;j2++)
 			{
 				A[j2][n-1-k]=ttt++;
 			}
 			for (int j3=n-2-k;j3>=k;j3--) 
 			{
 				A[n-1-k][j3]=ttt++;
 			}
 			for(int j4=n-2-k;j4>k;j4--)
 			{
 				A[j4][k]=ttt++;
 			}
 			k++;
 		}
 		if(n%2==1)
 		{
 			A[n/2][n/2]=ttt;
 		}
 		for(int h1=0;h1<n;h1++)
 		{
 			for(int h2=0;h2<n;h2++)
 			{
 				System.out.print(A[h1][h2]+" ");
 			}
 			System.out.println();
 		}
 	}
}
