public class c3PrimitiveDataType {
    public static void main(String args[]){
        byte age = 19; // small range then int
        int a = 100_000_000; // here underscore(_) is same as we use comma (,) to make a value more readable
        long b = 3_000_000_000L; // L/l is used here to tell this value is not an integer value it's long type value
        float c = 3.12f; // F/f is used here to tell this value is not a double value it's float value
        char ch = 'A'; // used to store one character in it
        boolean bool = true; // boolean has two values (true or false)
        System.out.println(age);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(ch);
        System.out.println(bool);
    }
}
