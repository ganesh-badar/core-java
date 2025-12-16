import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GenericList {
    public static void main(String[] args) {
        List<String>l1=new ArrayList<String>();
        l1.add("pune");
        l1.add("mumbai");
        l1.add("Dehli");
        l1.add("Goa");
        l1.add("Chennai");
      //  System.out.println(l1);

        ListIterator<String>l=l1.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
        System.out.println("* * * * * *  *  * * *  ** *   ");

        while(l.hasPrevious()){
            System.out.println(l.previous());
        }
    }
}
