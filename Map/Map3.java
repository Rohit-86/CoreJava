package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(7,"Msd");
		hm.put(18,"Virat");
		hm.put(1,"Rahul");
		hm.put(10,null);
		hm.put(18,"Abhishek");
		hm.put(null,"Rohit");
		hm.put(3,"Raina");
		LinkedHashMap <Integer,String> lhm = new LinkedHashMap <Integer,String>();
		lhm.put(7,"Msd");
		lhm.put(18,"Virat");
		lhm.put(1,"Rahul");
		lhm.put(10,null);
		lhm.put(18,"Abhishek");
		lhm.put(null,"Rohit");
		lhm.put(3,"Raina");
		System.out.println(hm);
		System.out.println(lhm);
		
	}
}
