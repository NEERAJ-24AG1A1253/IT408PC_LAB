import java.util.*;
class L7P5 extends Thread{
    L7P5(String str){
        super(str);
    }
    public static void main(String...args){
        L7P5 t1 = new L7P5("Even-Thread");
        L7P5 t2 = new L7P5("Odd-Thread");

        t1.start();
        t2.start();
    }

    @Override
    public void run(){
        for (int i = 0; i <= 20; i++){
            try{
                if(this.getName().equals("Even-Thread") && i % 2 == 0){
                    System.out.println(this.getName() + " : " + i);
                    Thread.sleep(200);
                }else if
			(this.getName().equals("Odd-Thread") && i % 2 != 0){
                    	System.out.println(this.getName() + " : " + i);
                    	Thread.sleep(200);
		}
            }catch(Exception e){
            }
        }
    }
}
