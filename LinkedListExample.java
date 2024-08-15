import java.util.Iterator;
import java.util.LinkedList;

class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Amruta");
        list.add("Tejasri");
        list.add("Tejas");
        list.add("Damini");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}