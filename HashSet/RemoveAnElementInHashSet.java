import java.util.HashSet;

class RemoveAnElementInHashSet{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Damini");
        set.add("Tejas");
        set.add("Amruta");
        set.add("Tejasri");
        set.add("Gaurav");

        System.out.println("Elements in set : "+set);

        System.out.println("Removing specific element from set");
        set.remove("Gaurav");

        System.out.println("After removing "+set);
        HashSet<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Gaurav");

        set.addAll(set1);
        System.out.println("Updated set is : "+set);
        set.removeIf(str->str.contains("Ajay"));
        System.out.println("After removing specific element : "+set);
        
        System.out.println("Removing all elements " );
        set.clear();
        System.out.println("Printing set "+set);
    }
}