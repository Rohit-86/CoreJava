package collectionFramework;

import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        LinkedHashSet l1 = new LinkedHashSet();
        l1.add("Virat");
        l1.add("Msd");
        l1.add("Rahul");
        l1.add("Raina");
        l1.add("Yuvi");
        l1.add("Raina");
        //LOGIC 1
        System.out.println("REVERSE DIRECTION LOGIC 1");
        ArrayList<String> a = new ArrayList<String>(l1);
        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.print(a.get(i) + " ");
        }
        //LOGIC 2
        System.out.println();
        System.out.println("REVERSE DIRECTION LOGIC 2");
        Object x [] = l1.toArray();
        for (int i = x.length-1; i >= 0; i--) {
            System.out.print(x[i]+" ");
        }
    }
    
}
