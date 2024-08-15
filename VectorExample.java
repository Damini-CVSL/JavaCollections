import java.util.*;
class VectorExample{
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Damini");
        v.add("Tejas");
        v.add("Amruta");
        v.add("Tejasri");

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}