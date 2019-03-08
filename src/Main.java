import MyClasses.*;

public class Main {

    public static void main(String[] args)
    {
        Bill bill = new Bill();
        Product article1 = new Product("a",1);
        Product article2 = new Product("b",2);
        Product article3 = new Product("c",3);

        bill.AddProductToBill(article1);
        bill.AddProductToBill(article2);
        bill.AddProductToBill(article3);

        System.out.print(bill.toString());
    }

}