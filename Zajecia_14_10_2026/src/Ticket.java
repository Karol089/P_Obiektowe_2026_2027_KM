import java.time.LocalDateTime;

public class Ticket {
    Movie forMovie;
    Room room;
    String dateTime;
    double price;

    public Ticket(Movie forMovie,
                  Room room,
                  String dateTime,
                  double price) {
        this.forMovie = forMovie;
        this.room = room;
        this.dateTime = dateTime;
        this.price = price;
    }

    public Ticket(Movie forMovie, double price) {
        this(forMovie, new Room(), "--.--.---- --:--", price);
    }

    public void modifyDate(String newDate){
        this.dateTime = newDate;
    }

    public void modifyPrice(double newPrice){
        this.price = newPrice;
    }

    public void showInfo(){
        System.out.printf("Film: %s \nPokój: %s \nData seansu: %s \nCena: %.2f\n\n",
                this.forMovie.title + ", reżyserstwa " + this.forMovie.director,
                this.room.id,
                this.dateTime,
                this.price);
    }
}
