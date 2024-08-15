import java.util.TreeSet;
class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
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