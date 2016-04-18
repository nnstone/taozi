package test;

import java.util.Scanner;

public class BlackBox
{
	public void divid()
	{
		
		//�������ֳַ��ĸ��ĸ�һ��
	}
	
	public boolean judge()
	{
		return false;
	}
	public void changeTo(char[] ch)
	{
		//��Ҫ��ת��,��Ҫ��������
		
	/*	String[] strCh={"��","Ҽ","��","��","��","��","½","��","��","��","ʰ","Ԫ","��","��","�����","��","��"};
		int n=ch.length;
		int count=0;
		for(int i=0; i<n; i++)
		{
			if((ch[i]>9 || ch[i]<0) && (ch[i] != '.'))
			{
				System.out.println("��������");
				break;
			}
			else if(ch[i] == '.')
			{
				count=count+1;
				if(count>1)
				{
					System.out.println("��������");
					break;
				}
				else if((i==0) || (i==(n-1)))
				{
					System.out.println("��������");
					break;
				}
			}
		}
		for(int i=0;i<strCh.length; i++)
		{
			System.out.println(strCh[i]);
		}
		*/
		
	}
	public static void main(String[] args) 
	{
		BlackBox bb=new BlackBox();
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		//������ʽ��Ҫ�ж�С�������0�����
		//��ȥ0���������divid����
		
		//��ջ��������ʽ
		
		int n=str.length();
		char[] num=str.toCharArray();
		bb.changeTo(num);
		for(int i=0; i<n; i++)
			System.out.println(num[i]);
		
	}
}
