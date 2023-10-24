package collectionFramework;

import java.util.ArrayList;
public class ArrList1 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        System.out.println(a1);
        a1.remove("Raina");
        System.out.println(a1);
        System.out.println(a1.contains("Msd"));
        System.out.println(a1.isEmpty());
        a1.clear();
        System.out.println(a1);
    }
    
    
}
