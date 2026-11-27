package zad8;

public class Zad8 {
    public static void main(String[] args){
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);
        // a & b odnoszą się do tego samego obiektu
        // c jest nowym, odróżnialnym obiektem o identycznej wartości

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);
        System.out.println(a == b);
        System.out.println(a == c);
        /*
        Przwidywania do wyświetleń:
        20
        20
        30
        true
        false
         */
    }
}
