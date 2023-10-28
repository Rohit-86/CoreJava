package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrList6 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        TreeSet t1 = new TreeSet(a1);
        System.out.println("ASC ORDER");
        for (Object o : t1) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("DESC ORDER");
        for (Object o : t1.descendingSet()) {
            System.out.print(o+" ");
        }
        
    }
}
