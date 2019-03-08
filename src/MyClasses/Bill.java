package MyClasses;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    private int id;
    private LocalDateTime date;
    private List<Product> listOfProducts = new ArrayList<> () ;
    private double price;

    public Bill(){
        this.price = 0;
        this.date = LocalDateTime.now();
    }

    public void AddProductToBill(Product product1){
        listOfProducts.add(product1);
        this.price = this.price + product1.getPrice();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < listOfProducts.size(); i++) {
            print = print + listOfProducts.get(i).getName() + "  " + listOfProducts.get(i).getPrice() + "€\n";
        }
        print = print + listOfProducts.size() + "\n" + price + "€" + "\n" + this.date;

        return print;
    }
}
