import java.util.ArrayList;

class IsEmptyMethodInArrayList{
    public static void main(String[] args) {
         ArrayList<String> list1 = new ArrayList<>();
        list1.add("Damini");
        list1.add("Tejas");
        list1.add("Swathi");

        System.out.println("Checking the ArrayList Weather it is emptyOrNot : "  +list1.isEmpty());
    }
}