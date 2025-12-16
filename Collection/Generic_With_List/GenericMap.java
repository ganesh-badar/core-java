import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericMap {
    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "puneune");
        m.put(2, "mumbai");
        m.put(3, "Dehli");

        Set<Integer> s = m.keySet();
        Iterator<Integer> i = s.iterator();

        while (i.hasNext()) {
            int k = i.next();          // get key ONCE
            String value = m.get(k);  // get value using key
            System.out.println(k + " = " + value);
        }
    }
}
