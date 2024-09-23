import java.util.*;
public class tricky_program13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<GroceryItem> groceryitem = new ArrayList<>();
        groceryitem.add(new GroceryItem("Apple", 3, 50));
        groceryitem.add(new GroceryItem("Orange", 7, 80));
        groceryitem.add(new GroceryItem("Apple", 5, 30));

        
    }
}

class GroceryItem{
    String name;
    double pricePerUnit;
    int quantitySold;
    GroceryItem(String name, double pricePerUnit, int quantitySold) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantitySold = quantitySold;
    }

    double getTotalPrice() {
        return pricePerUnit * quantitySold;
    }
}