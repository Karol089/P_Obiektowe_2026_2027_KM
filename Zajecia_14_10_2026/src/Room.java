public class Room {
    String id;
    int seatsLeft;
    boolean isFree;
    Movie displayedMovie;

    public Room(String id, int seatsLeft, boolean isFree, Movie displayedMovie) {
        this.id = id;
        this.seatsLeft = seatsLeft;
        this.isFree = isFree;
        this.displayedMovie = displayedMovie;
    }

    public Room(String id, int seatsLeft) {
        this(id, seatsLeft, true, null);
    }

    public Room() {
        this("*/0", 0, true, null);
    }

    public void bookSeat(){
        this.seatsLeft -= 1;
    }

    public void bookSeats(int amount){
        this.seatsLeft -= amount;
    }

    public void changeMovie(Movie newMovie) {
        this.displayedMovie = newMovie;
        this.isFree = false;
    }

    public void cancelMovie(){
        this.displayedMovie = null;
        this.isFree = true;
    }
}
