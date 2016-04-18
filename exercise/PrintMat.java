package exercise;

public class PrintMat 
{
	public static void PrintMatrixC(int[][] numbers,int colums,int rows)
	{
		if((numbers==null) || colums<=0 || rows<=0)
			return;
		int start=0;
		while(colums>start*2 && rows>start*2)
		{
			PrintMatrixIncircle(numbers,colums,rows,start);
		}
	}
	public static int[] printNumber(int number)
	{
		return null;
	}
	public static void PrintMatrixIncircle(int[][] numbers,int colums, int rows, int start)
	{
		int endX=colums-1-start;
		int endY=rows-1-start;
		for(int i=start; i<=endX; i++)
		{
			int number=numbers[start][i];
			printNumber(number);
		}
		if(start<endY)
		{
			for(int i=start+1; i<=endY;i++)
			{
				int number=numbers[i][endX];
				printNumber(number);
			}
		}
		if(start<endX && start<endY)
		{
			for(int i=endX-1;i>=start;i--)
			{
				int number=numbers[endY][i];
				printNumber(number);
			}
		}
		if(start<endX && start<endY-1)
		{
			for(int i=endY-1;i>=start;i--)
			{
				int number=numbers[i][start];
				printNumber(number);
			}
		}
	}
	public static void main(String[] args)
	{
		int[][] mat={{57,50,59,18,31,13},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98}};
	}

}
