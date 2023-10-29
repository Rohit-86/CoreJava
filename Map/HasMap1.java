package Map;

import java.util.HashMap;


public class HasMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(7,"Msd");
		hm.put(18,"Virat");
		hm.put(1,"Rahul");
		hm.put(10,null);
		hm.put(18,"Abhishek");
		hm.put(null,"Rohit");
		hm.put(3,"Raina");
		for(Object o: hm.entrySet()) { //key,Values
			System.out.println(o);
		}
		System.out.println();
		for(Object o: hm.keySet()) { //keys
			System.out.println(o);
		}
		System.out.println();
		for(Object o: hm.values()) { //Values
			System.out.println(o);
		}
		
	}
}
