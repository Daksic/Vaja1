package MyClasses;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Product> list = new ArrayList<> () ;

    public void AddProduct(Product product1){
        list.add(product1);
    }

    public void PrintList(){
        for(int i=0; i<this.list.size();i++){
            System.out.print(list.get(i).getName() + "  " + list.get(i).getPrice() + "€\n");
        }
    }

}
