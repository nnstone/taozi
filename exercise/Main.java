package exercise;

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0; i<n; i++)
        {
            if(num[i]<2)
                System.out.println("1");
            else if(num[i]<4)
                System.out.println("2");
            else
            {
                temp=1;
                for(int j=1;j<=num[i]/2;j++)
                {
                    if(num[i]%j==0)
                    {
                        temp=temp+1;
                    }
                }
                System.out.println(temp);
            }
        }
    }
}

