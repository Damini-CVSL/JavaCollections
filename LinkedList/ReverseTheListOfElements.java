import java.util.Iterator;
import java.util.LinkedList;

class ReverseTheListOfElements{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("papaya");

        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}