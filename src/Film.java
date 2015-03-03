public class Film {
    private String name;
    private int year;
    private int starRating;  //stars out of 5

    //constructor
    public Film(String name, int year, int starRating) {
        this.name = name;
        this.year = year;
        this.starRating = starRating;
    }

    //accessor methods below

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getStarRating() {
        return starRating;
    }

    //part a - Override toString method here
}
