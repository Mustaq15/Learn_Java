package Assignment4_Inheritence;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();

        //Assigning values
        person.age=23;
        person.name="Shams";

        student.age=21;
        student.name="MustaqAhmed";
        student.grade="A+";

        teacher.age=32;
        teacher.name="Onkar";
        teacher.subject="Java Programming";

        //Calling the display() method to check inheritance
        person.display();
        student.display();
        teacher.display();
    }
}