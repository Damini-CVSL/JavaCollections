import java.util.LinkedHashSet;

class LinkedHashSetExample{
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Guava");

        for(String str : set){
            System.err.println(str);
        }
    }
}