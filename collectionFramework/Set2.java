package collectionFramework;

import java.util.LinkedHashSet;

public class Set2 {
    public static void main(String[] args) {
        LinkedHashSet l1 = new LinkedHashSet();
        l1.add("Virat");
        l1.add("Msd");
        l1.add("Rahul");
        l1.add("Raina");
        l1.add("Yuvi");
        l1.add("Raina");
        for (Object x : l1) {
            System.out.print(x + " ");
        }
    }
}
