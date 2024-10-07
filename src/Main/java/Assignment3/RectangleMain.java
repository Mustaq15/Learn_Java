package Assignment3;

public class RectangleMain {

    public static void main(String[] args) {
//		Default Constructor(Default values of length and width as 1)
        Rectangle rec1=new Rectangle();
        rec1.display();
        rec1.area();
        rec1.perimeter();
        System.out.println();

//		Constructor with single parameter(makes it a square)
        Rectangle rec2=new Rectangle(5.0);
        rec2.display();
        rec2.area();
        rec2.perimeter();
        System.out.println();

//		Constructor with two parameter(length and width)
        Rectangle rec3=new Rectangle(5.0,6.0);
        rec3.display();
        rec3.area();
        rec3.perimeter();

    }

}
