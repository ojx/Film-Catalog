public class Main {
    public static void main(String[] args) {
        //code for testing only

        FilmCatalog catalog = new FilmCatalog();

        catalog.addFilm(new RestrictedMovie("Marvel's The Avengers", 2012, 3, "Action", new Actor[] {new Actor("Robert Downey Jr.", true), new Actor("Chris Hemsworth", true), new Actor("Scarlett Johansson", false), new Actor("Mark Ruffalo", true), new Actor("Jeremy Renner", true) } , 13));
        catalog.addFilm(new RestrictedMovie("The Wolf of Wall Street", 2013, 4, "Drama", new Actor[] {new Actor("Leonardo Di Caprio", true), new Actor("Jonah Hill", true), new Actor("Margot Robbie", false)} , 16));
        catalog.addFilm(new Documentary("The Square", 2013, 2, "Egyptian revolution"));
        catalog.addFilm(new RestrictedMovie("Dallas Buyers Club", 2013, 5, "Drama", new Actor[] {new Actor("Matthew McConaughey", true), new Actor("Jennifer Garner", false), new Actor("Jared Leto", true)} , 16));
        catalog.addFilm(new RestrictedMovie("Rush", 2013, 3, "Drama", new Actor[] {new Actor("Daniel Bruhl", true), new Actor("Chris Hemsworth", true), new Actor("Olivia Wilde", false)} , 16));
        catalog.addFilm(new Movie("Frozen", 2013, 4, "Animated", new Actor[] {new Actor("Kristen Bell", false), new Actor("Josh Gad", true), new Actor("Idina Menzel", false)} ));
        catalog.addFilm(new Movie("The Croods", 2013, 2, "Animated", new Actor[] {new Actor("Nicolas Cage", true), new Actor("Emma Stone", false)} ));
        catalog.addFilm(new Documentary("Blackfish", 2013, 3, "Mistreatment of killer whales"));
        catalog.addFilm(new Documentary("The Act of Killing", 2013, 4, "Indonesian death squads"));
        catalog.addFilm(new Documentary("Bowling for Columbine", 2012, 5, "Gun violence"));
        catalog.addFilm(new RestrictedMovie("Iron Man 3", 2013, 2, "Action", new Actor[] {new Actor("Robert Downey Jr.", true), new Actor("Gwyneth Paltrow", false), new Actor("Guy Pearce", true) } , 13));
        catalog.addFilm(new RestrictedMovie("Don Jon", 2013, 1, "Comedy", new Actor[] {new Actor("Scarlett Johansson", false), new Actor("Julianne Moore", false), new Actor("Joseph Gordon-Levitt", true), new Actor("Tony Danza", true) } , 13));
        catalog.addFilm(new Documentary("Leviathan", 2013, 3, "Fishing off coast of Massachusetts"));
        catalog.addFilm(new RestrictedMovie("Hitchcock", 2012, 1, "Drama", new Actor[] {new Actor("Anthony Hopkins", true), new Actor("Scarlett Johansson", false), new Actor("Helen Mirren", false)}, 15));
        catalog.addFilm(new RestrictedMovie("The Hunger Games: Catching Fire", 2013, 3, "Adventure", new Actor[] {new Actor(" Jennifer Lawrence", false), new Actor("Josh Hutcherson", true), new Actor("Liam Hemsworth", true)}, 13));

        Actor actor1 = new Actor("Robert Downey Jr.", true);
        Actor actor2 = new Actor("Scarlett Johansson", false);
        System.out.println("Films starring " + actor1.getName() + ": " + catalog.getFilmsByActor(actor1));
        System.out.println("Films starring " + actor2.getName() + ": " + catalog.getFilmsByActor(actor2));
        System.out.println("Best Documentary of 2013: " + catalog.getBestFilm("Documentary", 2013));
        System.out.println("Best Children's Film of 2013: " + catalog.getBestFilm("Childrens", 2013));
        System.out.println("Best Drama Film of 2013: " + catalog.getBestFilm("Drama", 2013));
        System.out.println("Best Action Film of 2013: " + catalog.getBestFilm("Action", 2013));
    }
}
