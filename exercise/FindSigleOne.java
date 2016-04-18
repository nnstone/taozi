package exercise;

import java.util.Arrays;

public class FindSigleOne
{
	public int singleNumber(int[] A)
    {
        Arrays.sort(A);
       	if(A.length==1)
            return A[0];
        for(int i=0; i<A.length-1;)
        {
        	while(A[i]==A[i+1])
                i=i+2;
            return A[i];
        }
      return 0;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
