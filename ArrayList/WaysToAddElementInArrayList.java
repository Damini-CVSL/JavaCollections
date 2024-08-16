import java.util.ArrayList;

class WaysToAddElementInArrayList{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Damini");
        list1.add("Tejas");
        list1.add("Swathi");
        System.out.println("After invoking add(E e) method: "+list1);
        list1.add(1,"Amruta");
        System.out.println("After inoking add(int index, E elemnt) method "+list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Tejasri");
        list2.add("geethika");

        list1.addAll(list2);
        System.out.println("Printing list1 "+list1);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Khushi");
        list3.add("Jaywanth");

        list1.addAll(1,list3);
        System.out.println("Printing list1 : "+list1);
    }
}