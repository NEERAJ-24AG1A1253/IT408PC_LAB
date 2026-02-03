import java.lang.*;
import java.util.Scanner;
class L2P2{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int x = s.nextInt();
		int[] arr = new int[x];
		System.out.println("enter the numbers of the array");
		for(int i=0;i<arr.length;i++){
			arr[i] = s.nextInt();
		}
		int y = 0;
		for( int e : arr){
			if(isPrime(e) && e != 1){
				y++;
				System.out.println(e);
			}
		}
		System.out.println("total number of prime number is : "+y);
	}
	public static boolean isPrime(int x){
		for(int i=2;i<x;i++){
			if(x % i == 0)return false;
		}
		return true;
	}
}