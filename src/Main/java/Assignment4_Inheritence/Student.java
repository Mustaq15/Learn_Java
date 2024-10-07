package Assignment4_Inheritence;

public class Student extends Person{
    String grade;

    public void display()
    {
        System.out.println(name+"\n"+age+"\n"+grade+"\n");
    }
}
