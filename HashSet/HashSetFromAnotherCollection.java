import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

class HashSetFromAnotherCollection{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jahnavi");
        list.add("Samantha");
        list.add("Alia bhatt");
        list.add("Deepika padukone");

        Set<String> set = new HashSet<>(list);
        set.add("Maheshbabu");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}