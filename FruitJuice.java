package assign.questions;
import java.util.Scanner;

public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    
    public FruitJuice() 
    {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    
    public void input() {
        
        flavour = "orange";
        pack_type ="bottle";
        product_code =65;
        pack_size = 400;
        product_price =300;
        
    }
    
    public void discount() {
        product_price -= 10;
    }
    
    public void display() {
        System.out.println("the Product Code: " + product_code);
        System.out.println("the Flavour: " + flavour);
        System.out.println("the Pack Type is: " + pack_type);
        System.out.println("the Pack Size is: " + pack_size);
        System.out.println("the Product Price is: " + product_price);
    }
    
    public static void main(String args[]) {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}