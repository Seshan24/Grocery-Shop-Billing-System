import java.util.ArrayList;

public class Student
{
    public static void main(String[] args)
    {
        ArrayList<String>students = new ArrayList<>();
        students.add("Nimal");
        students.add("Kamal");
        students.add("Sunil");

        for(String student:students)
        {
            System.out.println(student);
        }
    }
}
