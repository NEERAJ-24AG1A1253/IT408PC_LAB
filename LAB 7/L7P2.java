import java.util.*;
class L7P2 extends Thread{
	public static void main(String...args){
		L7P2 p = new L7P2();
		p.start();
	}
	@Override
	public void run(){
		System.out.println("hello java");
	}
}