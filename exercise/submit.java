package exercise;

public class submit 
{
	 public int[] clockwisePrint(int[][] mat, int n, int m) 
	 {
		 int[] temp=new int[m*n];
	     int i,j,k=0,t=0;
	     int count=Math.min(m, n);
	     for(i=0; i<(m*n); i++)
	    	 temp[i]=0;
	     if(count==1)
	     {
	    	 if(n<m)
	    	 {
	    		 for(i=0;i<m;i++)
	    		 {
	    			 temp[t]=mat[0][i];
	    			 t++;
	        	 }
	         }
	    	 for(i=0;i<n;i++)
	    	 {
	    		 temp[t]=mat[i][0];
	    		 t++;
	    	}
	   }
	     for(;k<count/2;k++)
	     {
	    	 for(j=k;j<m-k;j++)
	    	 {
	    		 temp[t]=mat[k][j];
	             t++;
	            }
	    	 for(j=k+1;j<n-k;j++)
	    	 {
	    		 temp[t]=mat[j][m-1-k];
	    		 t++;
	    	}
	    	 for(j=m-2-k;j>=k;j--)
	    	 {
	    		 temp[t]=mat[n-1-k][j];
	             t++;
	         }
	    	 for(j=n-k-2;j>k;j--)
	    	 {
	    		 temp[t]=mat[j][k];
	             t++;
	         }
	    }
	     if((n%2==1) && (m%2==1))
	    	 temp[t]=mat[n/2][m/2];
	     for(i=0;i<(n*m);i++)
	    	 System.out.print(temp[i]+" ");
	     return temp;
	 }
	public static void main(String[] args) 
	{
		submit sm=new submit();
		int[][] mat={{57,50,59,18,31,13},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98}};
		
		sm.clockwisePrint(mat, 7, 3);
	}

}
