package app;

public class Product {
    private String name;
    private double price;
    private static int numberOfProducts;
    public static final int MAX_PRODUCTS = 10;

    public Product(String name, double price) {
        if(numberOfProducts < MAX_PRODUCTS){
            this.name = name;
            this.price = price;
            numberOfProducts++;
        } else {
            throw new IllegalStateException();
        }
    }

    public Product() {
        this("Unknown", 1);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public static int getNumberOfProducts(){
        return numberOfProducts;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }
}
