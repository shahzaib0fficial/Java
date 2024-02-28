package Classes;

public class Product {
    private String name;
    private int ammount;
    private double rating; 
    
    public Product(){
        name = "";
        ammount = 0;
        rating = 0.0;
    }

    public Product(String name,int ammount,double rating){
        this.name = name;
        this.ammount = ammount;
        this.rating = rating;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAmmount(int ammount){
        this.ammount = ammount;
    }
    
    public void setRating(double rating){
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
    
    public int getAmmount(){
        return ammount;
    }
    
    public double getRating(){
        return rating;
    }
}
