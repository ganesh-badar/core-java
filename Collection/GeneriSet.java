import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class GeneriSet {
    public static void main(String[] args) {
        Set<Float> s =new HashSet<Float>();
        s.add(23.0f);
        s.add(22.0f);
        s.add(21.3f);
        System.out.println(s);

        Iterator <Float> i =s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }

    }
}
