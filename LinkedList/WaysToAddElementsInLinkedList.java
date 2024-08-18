import java.util.LinkedList;

class WaysToAddElementsInLinkedList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Damini");
        list.add("Amruta");
        list.add("Tejasri");
        System.out.println("After adding elements to array list : "+list);
        System.out.println();
        System.out.println("Adding an element at the specific position");
        list.add(1,"Tejas");
        System.out.println("After adding element at specific location : "+list);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Jaywanth");
        list1.add("Deepa");
        System.out.println("Adding second list2 to first list at specific location ");
        list.addAll(1,list1);
        System.out.println("After adding list2 at specific location to list1 : "+list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Khushi");
        list2.add("Selena");

        System.out.println("Adding list3 to list1 ");
        list.addAll(list2);
        System.out.println("After adding list3 to list1 : "+list);
        System.out.println();
        System.out.println("Adding element to first position : ");
        list.addFirst("Geehika");
        System.out.println("After adding element at first position "+list);
        System.out.println("Adding element at last position : ");
        list.addLast("Harshith");
        System.out.println("After adding element at last position "+list);


    }
}