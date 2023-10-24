//create arrayList & Print the data in forward direction & backWard  Direction
package CoreJava.collectionFramework;

import java.util.ArrayList;

public class ArrList3 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        System.out.println("Forward Direction");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Backward Direction");
        for (int i = a1.size()-1; i >=0; i--) {
            System.out.print(a1.get(i) + " ");
        }
    }
    
}
