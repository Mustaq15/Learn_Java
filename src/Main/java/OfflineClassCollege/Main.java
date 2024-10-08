package OfflineClassCollege;

public class Main {
    public static void main(String[] args) {
        Student stu=new Student();
        Teacher teach=new Teacher();
        Teacher teach1=new Teacher();

//		Student details input
        stu.id=313;
        stu.name="MustaqAhmed";

//		Teachers details input
        teach.id=826;
        teach.name="Onkar";
        teach1.id=391;
        teach1.name="Shrikant";

//		Student & Teacher details
        stu.study();
        System.out.println();
        teach.teaches();
        System.out.println();
        teach1.teaches();

    }
}
