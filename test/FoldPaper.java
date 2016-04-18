package test;

public class FoldPaper 
{
	public String[] foldPaper(int n) 
    {
        int len=(int)Math.pow(2,n)-1;
		String[] strArr=new String[len];
        String[] strTemp;
        int k;
        
        if(n==1)
        {
            strArr[0]="down";
            return strArr;
        }
        else if(n>1)
        {
	        strTemp=foldPaper(n-1);
	        int tLen=strTemp.length;
	        k=tLen;
	        for(int i=0;i<tLen;i++)
	        {
	            strArr[i]=strTemp[i];
	        }
	        strArr[k++]="down";
	        for(int i=tLen-1; i>=0;)
	        {
	            if(strTemp[i]=="down")
	            {
	                strArr[k++]="up";
	                i--;
	            }
	            else
	            {
	                strArr[k++]="down";
	                i--;
	            } 	
	        }
	        return strArr; 
        }
        return strArr;
    }
	/*public String[] foldPaper(int n)
    {
		String[] strArr=new String[(int)Math.pow(2,n)-1];
        String str=" ";
        String temp="";
        int k=0;
        if(n==0)
            return null;
        else if(n==1)
            str="down"+" ";
            else if(n>2)
            {
            	str=foldPaper(n).toString()+"up"+" ";
            	n--;
            }
        int len=str.length();
        for(int i=0; i<len;)
        {
            if(str.charAt(i)==' ')
                i++;
            else
            {
                temp=temp+str.charAt(i);
                i++;
            }
            strArr[k]=temp;
            k++;
            temp="";
        }
        
        return strArr;
    }*/
	public static void main(String[] args) 
	{
		FoldPaper fd=new FoldPaper();
		String[] str=fd.foldPaper(5);
		for(int i=0; i<31; i++)
			System.out.println(str[i]);
		
	}
	
	/*
	 
	 "down"
	 
	  "down","down","up"
	  
	  "down","down","up", "down","down","up", "up"
	  
	  "down","down","up","down","down","up","up", "down","down","down","up","up","down","up","up"
	  
	 "down","down","up","down","down","up","up","down","down","down","up","up","down","up","up", 
	                                             "down","down","down","up","down","down","up","up","up","down","down","up","up","down","up","up"
	 
	  */
	

}
