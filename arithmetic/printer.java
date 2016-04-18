package arithmetic;

import java.util.*;

public class printer
{
    public int[] clockwisePrint(int[][] mat, int n, int m)
    {
        int[] temp=new int[n*m];
        int k=0;
        if(mat==null)
        {
            return null;
        }
        int startX=0,startY=0,endX=n-1,endY=m-1;
        while((startX<=endX)&&(startY<=endY))
        {
            if(startY==endY)
            {
                for(int i=startX;i<=endX;i++)
                {
                    temp[k]=mat[i][endY];
                    k++;
                }
               return temp;
            }
            if (startX == endX) 
            {  
                for (int i = startY; i <= endY; i++ )
                { 
                    temp[k]=mat[startX][i]; 
                    k++;
                } 
                return temp;
            }
            for (int i = startY; i < endY; i++ ) 
            { 
                temp[k]=mat[startX][i];
                k++;
            } 
            for (int i = startX; i < endX; i++ )
            {
                temp[k]=mat[i][endY];
                k++;
            }  
        
	    for (int i = endY; i > startY; i-- )
        { 
            temp[k]=mat[endX][i];
            k++;
	    }  
	    for (int i = endX; i > startX; i-- ) 
        {  
	        temp[k]=mat[i][startY]; 
            k++;
	    }  
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return temp;
    }
    public static void main(String[] args) 
	{
		printer tm=new printer();
		int[][] mat={{57,50,59,43,26,28},
				{62,86,98,3,6,8}};
		
		int[] numbers=tm.clockwisePrint(mat,2,6);
		for(int i=0; i<12;i++)
			System.out.print(numbers[i]+" ");
	
	}
}

/*public class printer 
{
    public int[] clockwisePrint(int[][] mat, int n, int m) 
    {
        int[] temp=new int[n*m];
        int k=0;
        if(mat==null || n<=0 || m<=0)
            return null;
        int start=0;
        while(n>start*2 && m>start*2)
        {
            int endX=n-1-start;
            int endY=m-1-start;
            for(int i=start; i<endX; i++)
            {
                temp[k]=mat[start][i];
                k++;
            }
            if(start<endY)
            {
                for(int i=start+1; i<=endY; i++)
                {
                    temp[k]=mat[i][endX];
                    k++;
                }
            }
            if(start<endX && start<endY)
            {
                for(int i=endX-1; i>=start; i--)
                {
                    temp[k]=mat[endY][i];
                    k++;
                }
            }
            if(start<endX && start<endY-1)
            {
                for(int i=endY-1;i>=start+1;i--)
                {
                    temp[k]=mat[i][start];
                    k++;
                }
            }
            start++;
        }
        return temp;
    }
    public static void main(String[] args)
	{
    	printer pt=new printer();
		int[][] mat={{57,50,59,18,31,13},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98}};
		int[] arr=pt.clockwisePrint(mat, 7, 7);
		for(int i=0; i<49; i++)
			System.out.print(arr[i]+"\n");
		
	}
}
*/