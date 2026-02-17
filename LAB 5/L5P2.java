import java.util.Scanner;
class L5P2{
	public static void main(String...args) throws AgeException{
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age < 18){
			throw new AgeException("Sorry");
		}else{
			System.out.println("Please vote");

		}
	}
}