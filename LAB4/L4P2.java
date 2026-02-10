import java.lang.*;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
class L4P2{
public static void main(String...args) throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader s =new BufferedReader(isr);
	try{
	int x=Integer.parseInt(s.readLine());
	int y=Integer.parseInt(s.readLine());
	System.out.println(x/y);
	//}catch(InputMismatchException ime){
		//System.out.println(ime.getMessage());
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		System.out.println("Exception Handled");
	}
	}
}

