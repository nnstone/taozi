package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanTest 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);  
		ArrayList<Integer> ns = new ArrayList<>();  
		do {  
		    String string = scanner.nextLine();  
		    if (string.equals("")) {  
		break;
		    }  
		    ns.add(Integer.valueOf(string));  
		} while (true);  
		  
		System.out.println(ns);  
	}
}
