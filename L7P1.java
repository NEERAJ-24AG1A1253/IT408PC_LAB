import java.util.*;
class L7P1 extends Thread{
	L7P1(String str){
		super(str);
	}
	public static void main(String...args){
		L7P1 l = new L7P1();
		l.start();
	}
	@Override
	public void run(){
		System.out.println("hello java");
	}
}