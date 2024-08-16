import java.util.ArrayList;

class RemoveElementsFromArrayList{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Damini");
        list1.add("Tejas");
        list1.add("Swathi");

        System.out.println("An initial list of elements : "+list1);
        System.out.println();
        System.out.println("Removing specific elemnt from list");
        list1.remove("Swathi");
        System.out.println("After invoking remove(object) method : "+list1);
        System.out.println();
        System.out.println("Removing element on the basis of specific index");
        list1.remove(1);
        System.out.println("After invoking remove(index) method: "+list1); 

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tejasri");
        list2.add("geethika");

        list1.addAll(list2);
        System.out.println("After adding list2 in list1 : "+list1);
        list1.removeIf(str-> str.contains("geethika"));
        System.out.println(list1);
        list1.clear(); // removing elements available in the list
        System.out.println("After using clear method : "+list1);
    }

}