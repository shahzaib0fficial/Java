public class c16LogicalOperators {
    public static void main(String[] args){
        // used to combine two relational conditions
        int a = 5;
        int b = 10;
        int c = 6;
        int d= 13;

        System.out.println((a<b)&&(c>d)); // returns true only if both conditions are true
        System.out.println((a<b)||(c>d)); // returns fasle only if both conditions are false
        System.out.println(!((a<b)&&(c>d))); // returns true to false and false to true
    }
}
