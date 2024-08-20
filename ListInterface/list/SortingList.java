package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortingList{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Grapes");
        list.add("Guava");

        Collections.sort(list);
        System.out.println("After soting : "+list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(11);
        list1.add(10);
        list1.add(1);

        Collections.sort(list1);
        System.out.println("After soting : "+list1);
    }
}