package collectionFramework.Iterator_ListIterator;

    
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Virat");
		al.add("Rahul");
		al.add("Raina");
		al.add("Msd");
		System.out.println("Print in Forward Direction");
		Iterator<String> x = al.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		
		System.out.println();
		System.out.println("Print in Reverse Direction");
		ListIterator<String> x1 = al.listIterator(al.size());
		while(x1.hasPrevious()) {
			System.out.println(x1.previous());
		}
	}

}

}
