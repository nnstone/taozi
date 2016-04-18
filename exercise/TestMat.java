package exercise;

public class TestMat
{
	public void printCircle(int[][] matrix, int startX, int startY, int endX, int endY) {  
	    // only one column left  
	    if (startY == endY) {  
	        for (int i = startX; i <= endX; i++ ) {  
	            System.out.println(matrix[i][endY]);  
	        }  
	        return;  
	    }  
	    // only one row left  
	    if (startX == endX) {  
	        for (int i = startY; i <= endY; i++ ) {  
	            System.out.println(matrix[startX][i]);  
	        }  
	        return;  
	    }  
	    for (int i = startY; i < endY; i++ ) {  
	        System.out.println(matrix[startX][i]);  
	    }  
	    for (int i = startX; i < endX; i++ ) {  
	        System.out.println(matrix[i][endY]);  
	    }  
	    for (int i = endY; i > startY; i-- ) {  
	        System.out.println(matrix[endX][i]);  
	    }  
	    for (int i = endX; i > startX; i-- ) {  
	        System.out.println(matrix[i][startY]);  
	    }  
	  
	}  
	      
	public void printMatrix(int[][] matrix) {  
	      
	    if (matrix == null) {  
	        return;  
	    }  
	    int startX = 0;  
	    int startY = 0;  
	    int endY = matrix[0].length - 1;  
	    int endX = matrix.length - 1;  
	      
	    while ((startX <= endX) && (startY <= endY)) {  
	        printCircle(matrix, startX, startY, endX, endY);  
	        startX++;  
	        startY++;  
	        endX--;  
	        endY--;  
	    }  
	}  
	public static void main(String[] args) 
	{
		TestMat tm=new TestMat();
		int[][] mat={{57,50,59,43,26,28},
				{62,86,98,3,6,8}};
		
				
				
		/*int[][] mat={{57,50,59,18,31,13},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98},
				{43,26,65,0,64,28},
				{62,86,38,19,37,98}};*/
		tm.printMatrix(mat);
	
	}

}
