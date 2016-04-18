package exercise;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeList 
{
	public boolean chkPalindrome(ListNode A)
    {
		Stack<Integer> st= new Stack<Integer>();
		ListNode t=A;
		ListNode p=A;
		while(t.next !=null)
		{
            st.push(new Integer(t.val));
            t=t.next;
		}
        st.push(new Integer(t.val));
        while(true)
        {
         	while(p.next != null)
            {
                if(!(p.val==st.pop()))
                	return false;
                p=p.next;
            }	
            if(!(p.val==st.pop()))
                return false;
            return true;
        }
    }
	public static void main(String[] args)
	{
		PalindromeList  pl=new PalindromeList ();
		//LinkNode ll={421,305,13,425,222,609,100,131,579,579,131,100,609,222,425,13,305,421};
		int[] arr={421,305,13,425,222,609,100,131,579,579,131,100,609,222,425,13,305,421};
		
		
	}

}
