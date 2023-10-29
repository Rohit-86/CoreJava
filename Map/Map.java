package Map;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(7,"Msd");
		hm.put(18,"Virat");
		hm.put(1,"Rahul");
		hm.put(10,"Sachin");
		hm.put(18,"Abhishek");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Rahul"));
		System.out.println(hm.get(18));
		hm.remove(1);
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}
}
