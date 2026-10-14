public class Movie {
    String title;
    String director;
    String genre;
    int duration;
    int ageRequirement;

    public Movie(String title,
                 String director,
                 String genre,
                 int duration,
                 int ageRequirement) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.duration = duration;
        this.ageRequirement = ageRequirement;
    }

    public Movie(String title,
                 String director,
                 String genre,
                 int duration){
        this(title, director, genre, duration, 0);
    }

    public Movie(){
        this("Unknown","Unknown","Unknown",0, 0);
    }
}
