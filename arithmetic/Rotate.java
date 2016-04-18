package arithmetic;

public class Rotate 
{
	public int[][] rotateMatrix(int[][] mat, int n) 
    {
		int[][] after=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				after[i][j]=mat[n-j-1][i];
			}
		}
		
		return after;
    }
	public static void main(String[] args) 
	{
		Rotate rt=new Rotate();
		int[][] mat={{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		int[][] a=rt.rotateMatrix(mat, 3);
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
