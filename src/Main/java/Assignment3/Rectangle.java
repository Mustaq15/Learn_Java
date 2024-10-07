package Assignment3;


public class Rectangle {
    double length;
    double width;

    void area()
    {
        double area = length*width;
        System.out.println("Area "+area);
    }

    void perimeter()
    {
        double perimeter = 2*(length+width);
        System.out.println("Perimeter "+perimeter);
    }

    void display()
    {
        System.out.println("Length \t: "+length+"\n"+"width \t: "+width);
    }

    Rectangle()
    {
        length=1;
        width=1;
    }

    Rectangle(double length)
    {
        this.length=length;
        this.width=length;
    }

    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }



}
