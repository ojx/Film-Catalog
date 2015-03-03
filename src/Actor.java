public class Actor {
    private String name;
    private boolean male;

    //constructor
    public Actor(String name, boolean male) {
        this.name = name;
        this.male = male;
    }

    //accessor methods below

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return !male;
    }

    @Override
    public String toString() {
        if (male)
            return "Actor: " + name;
        else
            return "Actress: " + name;
    }

    //part b - Override equals method here
}
