public class c18TernaryOperator {
    public static void main(String[] args){
        // condition ? if true : if not
        int a = 5;
        int b = 3;
        int max = a>b ? a : b; // returns a because condition is true
        System.out.println("Maximum value : "+max);
    }
}
