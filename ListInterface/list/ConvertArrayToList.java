package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ConvertArrayToList{
    public static void main(String[] args) {
        String[] arr = {"Java", "C++", "Dart", "Python", "Html"};
        System.out.println("Printing array : "+Arrays.toString(arr));


        System.out.println("Converting list to array  " );
        List<String> list = new ArrayList<>();
        for(String i : arr){
            list.add(i);
        }

        System.err.println("Printing list : "+list);
    }
}