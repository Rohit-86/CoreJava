package collectionFramework;
import java.util.*;

class LinkHasSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(75);
        lhs.add(66);
        lhs.add(57);
        lhs.add(22);
        lhs.add(99);
        ArrayList<Integer> al = new ArrayList<Integer>(lhs);
        Collections.sort(al);
        System.out.println("Ascending Order");
        for (Integer x : al) {
            System.out.print(x + " ");
        }
        System.out.println();
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Descending Order");
        for (Integer x :al ){
            System.out.print(x + " ");
        }
    }
}