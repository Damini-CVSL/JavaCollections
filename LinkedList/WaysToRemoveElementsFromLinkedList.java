import java.util.LinkedList;
import java.util.List;

class WaysToRemoveElementsFromLinkedList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Damini");
        list.add("Amruta");
        list.add("Gaurav");
        list.add("Tejasri");
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        list.add("Anuj");  
        list.add("Gaurav");  
        list.add("Harsh");  
        list.add("Virat");
        list.add("Tejasri");  
        list.add("Gaurav");  
        list.add("Harsh");  
        list.add("Amit");  

        System.out.println("Initial list of elements : "+list);
        System.out.println("Removing specific element from list ");
        list.remove("Gaurav");
        System.out.println("After removing: "+list);
        System.out.println("Removing element at specific location ");
        list.remove(5);
        System.out.println("After removing : "+list);
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Ravi");
        list1.add("hamumat");
        list.addAll(list1);
        System.out.println("Updated list : "+list);
        System.out.println("Removing all new elements from list : ");
        list.removeAll(list1);
        System.out.println("after removing : "+list);
        System.out.println("Remove first element from list");
        list.removeFirst();
        System.out.println("After removing first element : "+list);
        System.out.println("Remove last element from list");
        list.removeLast();
        System.out.println("After removing last element : "+list);
        System.out.println("Removing first occurrence of element from list");
        list.removeFirstOccurrence("Gaurav");
        System.out.println("after removing : "+list);
        System.out.println("Removing last occurance of an element from list");
        list.removeLastOccurrence("Tejasri");
        System.out.println("After removing : "+list);
        list.clear();
        System.out.println("Printing list "+list);
        
    }
}