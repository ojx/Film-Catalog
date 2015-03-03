public class RestrictedMovie extends Movie {
    private int minimumAge;

    //constructor
    public RestrictedMovie(String name, int year, int starRating, String genre, Actor[] actors, int minimumAge) {
        super(name, year, starRating, genre, actors);
        this.minimumAge = minimumAge;
    }

    //getter method
    public int getMinimumAge() {
        return minimumAge;
    }
}
