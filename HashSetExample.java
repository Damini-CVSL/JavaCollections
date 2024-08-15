import java.util.*;

class HashSetExample{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
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