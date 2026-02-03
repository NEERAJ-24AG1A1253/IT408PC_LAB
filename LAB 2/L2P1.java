import java.lang.*;
import java.util.Scanner;
class L2P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		outerfor:
			for(int i=1;i<=x;i++){
				for(int j=1;j<=10;j++){
					System.out.println(i +" * "+j+" = "+ i*j);
					if(j>=10){
						System.out.println("Do you want to continue:");
						switch(s.nextInt()){
							case 0:
								break outerfor;
							case 1:
								continue;
							default:
								System.out.println("invalid input");
						}
					}
				}
			}
	}
}		
								


