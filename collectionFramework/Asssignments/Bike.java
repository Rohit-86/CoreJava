package collectionFramework.Asssignments;

import java.util.ArrayList;

public class Bike {
	String name;
	String color;
	int price;
	
	Bike(String n, String c, int p){
		this.name = n;
		this.color = c;
		this.price = p;
	}
}
class Lipistic {
	String brand;
	String shade;
	int price;
	
	Lipistic(String b, String s, int p) {
		this.brand = b;
		this.shade = s;
		this.price = p;
	}
	
	public static void main(String[] args) {
		Bike b1 = new Bike("Z900","Green",2500000);
		Bike b2 = new Bike("Duke", "Orange", 60000);
		Bike b3 = new Bike("HayaBusa","White",830000);
		Bike b4 = new Bike("Ninja","Black",250000);
		Lipistic l1 = new Lipistic("L1PINK","Pink",850);
		Lipistic l2 = new Lipistic("Lakme","Brown",669);
		Lipistic l3 = new Lipistic("SQ999","Red",2800);
		Lipistic l4 = new Lipistic("R1P", "Pink", 1500);
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(b1);al.add(b2);al.add(b3);al.add(b4);
		al.add(l1);al.add(l2);al.add(l3);al.add(l4);
		
		//Print where name is Duke
		for(Object o : al) {
			if(o instanceof Bike) {
				Bike b = (Bike)o;
				if(b.name.equalsIgnoreCase("Duke")) {
					System.out.println(b.name+" "+b.color+" "+b.price);
				}
			}
		}
		//print the bike details b/w range
		System.out.println();
		for(Object o : al) {
			if(o instanceof Bike) {
				Bike b = (Bike)o;
				if(b.price>185000 && b.price<259999) {
					System.out.println(b.name+" "+b.color+" "+b.price);
				}
			}
		}
		
		//print the lakme brand lipistic details
		System.out.println();
		for(Object o: al) {
			if(o instanceof Lipistic) {
				Lipistic l = (Lipistic)o;
				if(l.brand.equalsIgnoreCase("Lakme")) {
					System.out.println(l.brand+" "+l.shade+" "+l.price);
				}
			}
		}
		
		//print lipistic which price range between 600 - 2500
		System.out.println();
		for(Object o: al) {
			if(o instanceof Lipistic) {
				Lipistic l = (Lipistic)o;
				if(l.price>800 && l.price<2500) {
					System.out.println(l.brand+" "+l.shade+" "+l.price);
				}
			}
		}
		
	}
}