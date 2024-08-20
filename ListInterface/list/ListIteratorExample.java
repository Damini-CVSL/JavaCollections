package list;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorExample{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Grapes");
        list.add("Guava");

        ListIterator<String> itr =list.listIterator();
        while(itr.hasNext()){
            System.out.print("index : "+itr.nextIndex()+ " value : "+itr.next());
        }
        System.out.println("traversing elements in reverse order : ");
        while(itr.hasPrevious()){
            System.out.println("index : "+itr.previousIndex()+ " value : "+itr.previous());
        }
    }
}