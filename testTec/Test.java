package testTec;

public class Test {
	public int add(int a,int b){   
        try {
            return a+b;      
        } 
       catch (Exception e) {  
           System.out.println("catch����");
        }
        finally{ 
            System.out.println("finally����");
        }
        return 0;
   } 
    public static void main(String args[])
    {
       /* Employee e = new Employee("123");
        System.out.println(e.empID);*/
    	 Test test =new Test(); 
         System.out.println("���ǣ�"+test.add(9, 34)); 
    }
}

