import java.text.NumberFormat;

public class c13NumberFormatting {
    public static void main(String[] args){
        String currency = NumberFormat.getCurrencyInstance().format(100671.98);
        System.out.println("Currency representation of a Number is : "+ currency);
        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("Percent representation of 0.1 is : "+ percent);
    }   
}
