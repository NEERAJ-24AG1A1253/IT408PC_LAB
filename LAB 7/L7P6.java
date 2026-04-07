import java.util.*;
class L7P6 extends Thread{
	int amount = 1000;
	L7P6(String str){
        	super(str);
    	}
    	public static void main(String... args){
        L7P6 w = new L7P6("Withdrawal");
        L7P6 d = new L7P6("Deposit");
        System.out.println(w.getName());
        System.out.println(d.getName());
        w.start();
        d.start();
    	}
   	 @Override
    	public void run(){
        	String name = Thread.currentThread().getName();
        	if (name.equals("Deposit")){
			System.out.println(amount + " before deposit");
            		amount += 500;
            		System.out.println(amount + " after deposit");
        	}else if(name.equals("Withdrawal")){
			System.out.println(amount + " before withdrawl");
            		amount -= 300;
            		System.out.println(amount + " after withdrawal");
        	}
   	}
}