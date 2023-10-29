package Map;

import java.util.TreeMap;


public class Map4 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(7,"Msd");
		hm.put(18,"Virat");
		hm.put(1,"Rahul");
		hm.put(10,null);
		hm.put(18,"Abhishek");
//		hm.put(null,"Rohit");(This will give error)
		hm.put(45,"Rohit");
		hm.put(3,"Raina");
		System.out.println(hm);
	}
}
