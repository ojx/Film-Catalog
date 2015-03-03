public class Movie extends Film {
    private String genre;
    private Actor[] actors;

    public Movie(String name, int year, int starRating, String genre, Actor[] actors) {
        super(name, year, starRating);
        this.genre = genre;
        this.actors = actors;
    }

    public String getGenre() {
        return genre;
    }

    public int numberOfActors() {
        return actors.length;
    }

    public Actor getActor(int index) {
        return actors[index];
    }

    public boolean hasActor(Actor actor) {
        // part c

        return false; //remove this line
    }
}
