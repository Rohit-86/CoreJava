//Create VEctor add some data and convert that to arrayList
package collectionFramework;

import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("SamSung");
        v.add("Apple");
        v.add("MI");
        v.add("Oppo");
        v.add("RealMe");
        ArrayList <String> a = new ArrayList<String>(v);
        System.out.println(v);
        System.out.println(a);
    }
}