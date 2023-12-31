package lab6;

import java.util.LinkedList;

public class ProductList {
    private LinkedList<Product> data;
    private float money;

    public ProductList() {
        this.data = new LinkedList<>();
        money = 0;

    }
    public void inputProduct(Product product) {
        data.add(product);
    }

    public void showProducts() {
        for (Product p : data) {
            p.info();
        }
    }

    public Product mostPopular() {
        Product product = new Product("Null", 0, 0);
        int count = 0;
        for (Product p : data) {
            if (p.getCount() > count) {
                count = p.getCount();
                product = p;
            }
        }
        return product;
    }

    public float getSales() {
        this.countSales();
        return money;
    }
    private void countSales() {
        money = 0;
        for (Product p : data) {
            money += p.getCount() * p.getPrice();
        }
    }
}
