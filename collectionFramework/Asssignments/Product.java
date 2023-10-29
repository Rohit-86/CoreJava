package collectionFramework.Asssignments;
import java.util.ArrayList;

public class Product {
	String product_type;
	String name;
	int price;
	
	Product(String s, String n, int p){
		this.product_type = s;
		this.name = n;
		this.price = p;
		
	}
	
	
	public static void main(String[] args) {
		Product p1 = new Product ("Phone","MI",15000);
		Product p2 = new Product("Laptop","HP",69000);
		Product p3 = new Product("Shampoo", "Dove",230);
		Product p4 = new Product("Shampoo", "SunShilk",730);
		Product p5 = new Product("Laptop", "HP",53000);
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		//print the detail of product where....
		//product_type : Shampoo
		for(Product p : al) {
			if(p.product_type.equalsIgnoreCase("Shampoo")) {
				System.out.println(p.product_type+" "+p.name+" "+p.price);
			}
		}
		
		//product_type : Laptop, name : HP, priceRange : 35k - 60k
		System.out.println();
		for(Product p: al) {
			if(p.product_type.equalsIgnoreCase("Laptop") && p.name.equalsIgnoreCase("Hp")) {
				if(p.price>35000 && p.price<60000) {
					System.out.println(p.product_type+" "+p.name+" "+p.price);
				}
			}
		}
		
		//product_type shampoo ranging between 350 to 800
		System.out.println();
		for(Product p : al) {
			if(p.product_type.equalsIgnoreCase("Shampoo")) {
				if(p.price>350 && p.price<800) {
					System.out.println(p.product_type+" "+p.name+" "+p.price);
				}
			}
		}

	}

}