public class Samochod {
    // Pola (cechy samochodu)
    String marka;
    String model;
    int rokProdukcji;
    double przebieg;

    // Kontruktor 1
    public Samochod(String marka, String model, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    // Konstruktor 2
    public Samochod(String marka, String model, double przebieg) {
        this(marka, model, 2026, przebieg);
    }

    // Metody klasowe
    public void uruchom(){
        System.out.println(this.marka + " " + this.model + " został uruchomiony.");
    }

    public double zwrocPrzebieg(){
        return this.przebieg;
    }

    public void zwiekszPrzebieg(double value){
        if(value > 0) this.przebieg += value;
    }
}
