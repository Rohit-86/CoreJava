package CoreJava.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList5 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        Collections.sort(a1);
        System.out.println("ASCENDING ORDER");
        Object[] o = a1.toArray();
        for (Object i : o) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.sort(a1,Collections.reverseOrder());
        o = a1.toArray();
        System.out.println("DESCENDING ORDER");
        for (Object i : o) {
            System.out.print(i + " ");
        }

    }
}
