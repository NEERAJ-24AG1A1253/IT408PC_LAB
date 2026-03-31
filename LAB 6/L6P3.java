import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
 class L6P3{
	public static void main(String[] args){
		PriorityQueue<String> pq = new PriorityQueue<>();
		Scanner s = new Scanner(System.in);
		System.out.println(pq.isEmpty());
		for(int i=0;i<5;i++){
			pq.add(s.nextLine());
		}
		System.out.println(pq);
		int j=0;
		List<String> l = new LinkedList<>(pq);
		l.remove(3);		
		Collections.sort(l);
		pq.clear();
		pq.addAll(l); 
		Iterator<String> iterator = pq.iterator(); 
        		while(iterator.hasNext()){ 
        			System.out.println(iterator.next());
        		}
        		System.out.println("peek "+pq.peek());
	}
}
