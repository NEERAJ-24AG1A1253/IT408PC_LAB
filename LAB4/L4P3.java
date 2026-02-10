import java.util.*;
import java.lang.*;
import java.io.*;
class L4P3 extends Exception{ 
	public static void getValue(int x){
		if(x%2 != 0)
			throw new InputMismatchException("Odd Number");
		else
			System.out.println(x);
	}
	public static void main(String...args) throws Exception{
		Scanner s=new Scanner(System.in);
		try{
			int a = s.nextInt();
			getValue(a);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
