public class c12MathClass {
    public static void main(String[] args){
        int a = Math.round(1.1f);
        System.out.println("Maths.round() : "+a); //  round to nearest possible integer
        a = Math.max(1, 2);
        System.out.println("Math.max() : "+a); // return maximum value from two values
        a = Math.min(1, 2);
        System.out.println("Math.min() : "+a); // return minimum value from two values
        a = (int)Math.ceil(1.1);
        System.out.println("Math.ceil() : "+a); // return maximum integer value
        a = (int)Math.floor(1.9);
        System.out.println("Math.floor() : "+a); // return minimum integer value
        a = (int)(Math.random()*100); // returns any return value in between 0-100(Note : we can modify 100 to any other value) 
        System.out.println("Any random value : "+a);
    }
}
