package testTec;

public class Test {
	public int add(int a,int b){   
        try {
            return a+b;      
        } 
       catch (Exception e) {  
           System.out.println("catchÓï¾ä¿é");
        }
        finally{ 
            System.out.println("finallyÓï¾ä¿é");
        }
        return 0;
   } 
    public static void main(String args[])
    {
       /* Employee e = new Employee("123");
        System.out.println(e.empID);*/
    	 Test test =new Test(); 
         System.out.println("ºÍÊÇ£º"+test.add(9, 34)); 
    }
}

