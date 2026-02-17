import java.lang.*;
import java.util.Scanner;
class L5P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		try{
			int age = s.nextInt();
			if(age < 18){
				throw new AgeException("Sorry");
			}else{
				System.out.println("Please vote");
			}
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}