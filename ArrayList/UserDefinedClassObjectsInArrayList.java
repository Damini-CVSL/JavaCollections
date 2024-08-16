import java.util.ArrayList;
import java.util.Iterator;
class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class UserDefinedClassObjectsInArrayList
{
    public static void main(String[] args) {
        Student s1 = new Student(111, "Damini", 21);
        Student s2 = new Student(278, "Tejas", 22);
        Student s3 = new Student(147, "Geethika", 20);
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println("Name : "+st.name+ " Rollno : "+st.rollno+ " Age : "+st.age);
        }
    }

}