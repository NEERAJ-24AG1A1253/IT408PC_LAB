import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
class L6P1{
	public static void main(String[] args){
		ArrayDeque<String> ad = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);
		System.out.println(ad.isEmpty());
		for(int i=0;i<5;i++){
			ad.add(s.nextLine());
		}
		System.out.println();
		int j=0;
		List<String> l = new LinkedList<>(ad);
		l.remove(3);		
		Collections.sort(l);
		ad.clear();
		ad.addAll(l); 
		Iterator<String> iterator = ad.iterator(); 
        		while(iterator.hasNext()){ 
        			System.out.println(iterator.next());
        		}
        		System.out.println("peek "+ad.peek());
	}
}
