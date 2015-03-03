import java.util.ArrayList;

public class FilmCatalog {
    ArrayList<Film> films;

    //constructor
    public FilmCatalog() {
        films = new ArrayList<Film>();
    }

    //adds a film to the catalog
    public void addFilm(Film film) {
        films.add(film);
    }

    //return a list of films with a given actor
    public ArrayList<Film> getFilmsByActor(Actor actor) {
        //part d

        return null;
    }

    /*
     * Given a category and year return the film with the best rating.
     * Categories could be one of the following:
     *    - Documentary
     *    - Childrens (no age restriction)
     *    - A Movie Genre (e.g. Comedy, Action, Drama)
     */
    public Film getBestFilm(String category, int year) {
        //part e

        return null;
    }
}