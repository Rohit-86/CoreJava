package Map;

import java.util.*;
import java.util.Map.Entry;

public class HasMap3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(7,"Msd");
		hm.put(18,"Virat");
		hm.put(1,"Rahul");
		hm.put(10,null);
		hm.put(18,"Abhishek");
		hm.put(null,"Rohit");
		hm.put(3,"Raina");
		Set<Entry<Integer,String>> x = hm.entrySet();
		Iterator<Entry<Integer, String>>  z = x.iterator();
		while(z.hasNext()) {
			System.out.println(z.next());
		}
		
	}
}
