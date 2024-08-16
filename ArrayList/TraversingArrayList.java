import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class TraversingArrayList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Damini");
        list.add("Tejasri");
        list.add("Amrutha");
        list.add("Tejas");
        list.add("Niranjan Appaswamy");
        list.add("Deppa");
        list.add("Jaywanth");

        System.out.println("Traversing list through for each loop");
        for(String str : list){
            System.out.println(str);
        }

        System.out.println("Traversing list through List Iterator in reverse order ");

        ListIterator<String> itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        System.out.println("Traversing list through for loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through for each using lambda expression");
        list.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method");
        Iterator<String> itr1 = list.iterator();
        itr1.forEachRemaining(a->{
            System.out.println(a);
        });

        System.out.println("Traversing list throught Iterator");
        Iterator<String> itr2 = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}