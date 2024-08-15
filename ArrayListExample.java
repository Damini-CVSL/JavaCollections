import java.util.*;
class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Tejasri");
        list.add("Amruta");
        list.add("Damini");
        list.add("Tejas");
        list.add("Inkevaru odhu");

        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}