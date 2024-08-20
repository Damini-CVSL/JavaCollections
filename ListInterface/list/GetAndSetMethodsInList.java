package list;
import java.util.List;

import java.util.ArrayList;

class GetAndSetMethodsInList{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Grapes");
        list.add("Guava");

        System.out.println("Printing list : "+list);
        System.err.println("second element in list : "+list.get(1));
        
        System.out.println("changing the element ");
        list.set(1,"Papaya");

        for(String fruits: list){
            System.out.println(fruits);
        }

    }
}