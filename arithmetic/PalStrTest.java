package arithmetic;

import java.util.Scanner;

public class PalStrTest
{
	static boolean []flag = new boolean[1000];
	static int isBackString(String s)
	{
	    int len = s.length();
	    int i = 0, j = len - 1;
	    int maxlen = 0;
	    while(i <= j)
	    {
	        while(i <= j && flag[i] == false)
	            i++;
	        while(j >= i && flag[j] == false)
	            j--;
	        if(i == len || j == -1)
	            return 0;
	        if(i > j)
	            return maxlen;

	        if(s.charAt(i) == s.charAt(j) && i < j)
	        {
	        	 i++;
	        	 j--;
	        	 maxlen += 2;
	        }
	           
	        else if(s.charAt(i) == s.charAt(j) && i == j)
	        {
	        	i++;j--;maxlen ++;
	        }
	        else
	            return 0;
	    }
	    return maxlen;
	}
	static int maxlen = 1;
	static String result;
	static String collect_string(String s)
	{
	    String temp = new String();
	    for(int i = 0 ; i < s.length(); i++)
	    {
	        if(flag[i] == true)
	            temp += s.charAt(i);
	    }
	    return temp;
	}
	static void backString_recur(String s, int pos)
	{
	    if(pos == s.length())
	    {
	        int templen = isBackString(s);
	        if(templen > maxlen)
	        {
	            maxlen = templen;
	            result = collect_string(s);
	        }
	    }
	    else
	    {
	        flag[pos] = true;
	        backString_recur(s, pos + 1);
	        flag[pos] = false;
	        backString_recur(s, pos + 1);
	    }
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
	    backString_recur(str, 0);
	    System.out.println("len : "+ maxlen);
	    System.out.println("max string : "+ result);		
	}	
}
