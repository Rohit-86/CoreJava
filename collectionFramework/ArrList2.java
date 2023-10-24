package CoreJava.collectionFramework;
import java.util.ArrayList;

public class ArrList2 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Virat");
        a1.add("Msd");
        a1.add("Rahul");
        a1.add("Yuvi");
        a1.add("Raina");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i) + " ");
        }
        System.out.println();
        Object[] o = a1.toArray();
        for (Object i : o) {
            System.out.print(i + " ");
        }
    }
}
