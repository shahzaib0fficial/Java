public class c17ElseIfStatements {
    public static void main(String[] args){
        int temp = 24;
        if(temp < 20){ // Check if this condition is true then this block of code is executed
            System.out.println("It's too cold outSide");
        }
        else if (temp >=20 && temp < 30){ // Check if this condition is true then this block of code is executed
            System.out.println("It's a beautifull weather outSide");
        }
        else{ // If no condition is true then this block is executed
            System.out.println("It's too hot outSide");
        }
        // Note : if and if else can be used sepreatly
    }
}
