import java.util.Iterator;
import java.util.Stack;

class StackExample{
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Damini");
        st.push("Tejas");
        st.push("Amruta");
        st.push("Tejasri");

        Iterator<String> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}