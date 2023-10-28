package collectionFramework;
import java.util.*;

class HasSet3 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(75);
        hs.add(66);
        hs.add(57);
        hs.add(22);
        hs.add(99);
        TreeSet<Integer> al = new TreeSet <Integer>(hs);
        System.out.println("Ascending Order");
        for (Integer x : al) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("Descending Order");
        for (Integer x :al.descendingSet() ){
            System.out.print(x + " ");
        }
    }
}