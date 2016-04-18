package test;

public class B 
{
	 public void add(Byte b)
	    {
	        b = b++;
	    }
	    public void test()
	    {
	        Byte a = 127;
	        Byte b = 127;
	        add(++a);
	        System.out.print(a + " ");
	        add(b);
	        System.out.print(b + "");
	    }
	/*public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("¹¹Ôì¿é");
    }
    static
    {
        System.out.println("¾²Ì¬¿é");
    }*/
    public static void main(String[] args)
    {
        B t = new B();
        t.test();
        byte b1=1,b2=2,b3,b6; 
        final byte b4=6,b5=6; 
        b6=b4+b5; 
       // b3=(b1+b2); 
        String str="helloworld";
        String[] arr=new String[5];
        
        str=str+100;
       // str=100;
        System.out.println(b6);
    }
}
