public class c11ArithmeticOperators {
    public static void main(String[] args){
        int a = 1+2; // here + is an arithmetic operator
        System.out.println("A value : "+a);
        a++; // same as a = a + 1; used to increment one value
        System.out.println("After Increment : "+a);
        a--; // same as a = a - 1; used to decrement one value
        System.out.println("After Decrement : "+a);
        a+=5; //same as a = a+5;
        System.out.println("After Adding 5 : "+a);

        int val1 = 10;
        int val2 = 3;
        double divide = val1/val2;
        System.out.println("After Dividing two integers : "+divide); // 3.0 print instead of 3.333 because when two integer divides it return an ineger value
        divide = (double)val1/val2; // here we are making val1 from integer to double datatype this is known as Explicit type casting
        System.out.println("After Explicit type casting : "+divide); // now it returns 3.333 because now one from them is double 
    }
}