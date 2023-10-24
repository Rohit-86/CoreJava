package CoreJava.collectionFramework;

import java.util.ArrayList;

public class ArrList4 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        Object o[] = a1.toArray();
        System.out.println("Forward Direction");
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println();
        System.out.println("Backward Direction");
        for (int i = o.length-1; i >=0; i--) {
            System.out.print(o[i] + " ");
        }
    }
    
}
