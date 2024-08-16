import java.util.ArrayList;
import java.util.Iterator;

class RetainAllMethodInArrayList{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Damini");
        list1.add("Tejas");
        list1.add("Swathi");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tejas");


        list1.retainAll(list2);
        System.out.println("Iterating the elemnts after retaining the elements of list2 ");
        Iterator<String>  itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}