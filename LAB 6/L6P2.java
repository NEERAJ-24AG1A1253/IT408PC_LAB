import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class L6P2{
	public static void main(String...args){
		HashSet<String> hs = new HashSet<>();
		Scanner s = new Scanner(System.in);
		System.out.println("is empty check"+ hs.isEmpty());
		for(int i=0;i<5;i++){
			hs.add(s.nextLine());
		}
		System.out.println(hs);
		int j=0;
		List<String> l = new LinkedList<>(hs);
		
		l.remove(3);
		hs.clear();
		hs.addAll(l);
		Iterator<String> iterator=hs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
	
		