import java.awt.*;

public class c5PrimitiveVsRefrence {
    public static void main(String args[]){
        // Primitive Type
        byte a = 1; 
        byte b = a; // Both have diffrent memory locations
        a = 2;
        System.out.println("Value of a is : " + a); // + here is used to concatinate
        System.out.println("Value of b is : " + b); // change in a won't effect b

        // Refrence Type
        Point point1 = new Point(1,2);
        Point point2 = point1; // Both have same memory location
        point1.x = 10;
        System.out.println("Value of point1.x is : " + point1.x);
        System.out.println("Value of point2.x is : " + point2.x); // by changing the value of point1.x value it also changes point2.x value
    }
}