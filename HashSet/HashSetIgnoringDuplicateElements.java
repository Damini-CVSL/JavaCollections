import java.util.HashSet;
import java.util.Iterator;

class HashSetIgnoringDuplicateElements{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Guava");
        set.add("Papaya");
        set.add("Apple");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}