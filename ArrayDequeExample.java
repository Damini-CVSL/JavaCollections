import java.util.*;
class ArrayDequeExample{
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");
        deque.add("Grapes");
        deque.add("Guava");

        for(String str : deque){
            System.err.println(str);
        }

    }
}