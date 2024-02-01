public class c6Strings {
    public static void main(String args[]){
        // String data = new String("My Name is Shahzaib"); // proper Synatax
        String data = "   My Name is Shahzaib   "; // Short Hand
        System.out.println("String Length is : " + data.length());
        System.out.println("Accessing data first character : " + data.charAt(0));
        System.out.println("Accessing Index of 'N' : " + data.indexOf("N"));
        System.out.println("Removing all Extra wide spaces at beginning and end of the string : " + data.trim());
        System.out.println("Original String value : " + data);
        System.out.println("Note : Alot of Other method we can call on need");
    }
}
