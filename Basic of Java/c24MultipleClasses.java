class myClass{
    public void Display(){
        System.out.println("Run From myClass");
    }
}

public class c24MultipleClasses{
    public static void main(String[] args){
        System.out.println("Run From c24MultipleClasses");

        myClass myclass = new myClass();
        myclass.Display();
    }
}