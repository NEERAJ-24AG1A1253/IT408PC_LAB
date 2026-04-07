import java.util.*;
class L7P3 extends Thread{
	public static void main(String...args) throws Exception{
		L7P3 y = new L7P3();
		y.setName("java world");
		System.out.println(y.getState());
		y.start();
		System.out.println(y.getState());
		Thread.sleep(500);
		System.out.println(y.getState());
		y.join();
		System.out.println(y.getState());
	}
	@Override
	public void run(){
		System.out.println(this.getName()+"is running");
		System.out.println(this.getState());
		try{
			for(int i=0;i<=3;i++){
				System.out.println("awaiting step:"+i);
				System.out.println(this.getState());
				this.sleep(500);
			}
		}catch(Exception e){
		}
	}
}