package lab6;
public class Main {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());


        ProductList list = new ProductList();
        Product i1 = new Product("Bass Saxophone", 1250000, 1);
        Product i2 = new Product("Barithone Saxophone", 550000, 6);
        Product i3 = new Product("Tenor Saxophone", 400000, 4);
        Product i4 = new Product("Alto Saxophone", 250000, 3);
        Product i5 = new Product("Clarinet B", 175000, 2);

        list.inputProduct(i1);
        list.inputProduct(i2);
        list.inputProduct(i3);
        list.inputProduct(i4);
        list.inputProduct(i5);

        list.showProducts();
        System.out.println("Total - "+list.getSales());
        Product mostProduct = list.mostPopular();
        System.out.println("Most popular: " + mostProduct.getName());

    }

}
