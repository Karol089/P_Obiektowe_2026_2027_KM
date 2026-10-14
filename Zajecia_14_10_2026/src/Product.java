public class Product {

    String name;
    double price;

    public Product(String name, double price) {// nadmiarowy typ w kontruktorze
        this.name = name; // brakujące słowa this
        this.price = price;
        // słowo this wskazuje, że korzystamy z pól obecnie rozważanego obiektu
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}
