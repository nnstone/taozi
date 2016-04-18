package exercise;

import java.util.Arrays;

public class Solution 
{
	public int singleNumber(int[] A)
    {
        Arrays.sort(A);
        for(int i=0; i<A.length;)
        {
        	while((A[i] == A[i-1]) || (A[i] == A[i+1]))
        		i++;
        	return A[i];
        }
      return 0;
        
        /*for(int i=1; i<A.length-1;)
        {
            if((A[i] == A[i-1]) || (A[i] == A[i+1]))
                i++;
            else
                return A[i];
        }*/
    }
	/*public int run(TreeNode root) 
    {
        int x=0,y=0;
    	if(root==null)
            return 0;
        else
        {
            if(root==1)
            	return 1;
            else
                return (run(root.left)+1)<run(root.right)+1):run(root.left)+1)<run(root.right)+1);
        }
             
    }*/
	public static void main(String[] args)
	{

	}

}
