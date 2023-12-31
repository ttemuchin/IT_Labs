package lab6;

public class Product {
    private String name;
    private float price;
    private int count;

    public Product(String name, float price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public void info() {
        int shortPrice = (int) price /1000;
        System.out.println("\n"+ name + " \n" + shortPrice + " тыс.р. \n" + count);
    }
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
