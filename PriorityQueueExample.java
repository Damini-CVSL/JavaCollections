import java.util.*;

class PriorityQueueExample{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Damini");
        queue.add("Tejasri");
        queue.add("Geethika");
        queue.add("Khushi");
        System.out.println("Head : "+queue.element());
        System.out.println("Head : "+queue.peek());
        System.out.println("Iterating the queue elements : ");

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();
        System.out.println("After removing two elements : ");
        Iterator<String> itr1 = queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}