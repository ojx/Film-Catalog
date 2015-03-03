public class Documentary extends Film {
    private String topic;

    //constructor
    public Documentary(String name, int year, int starRating, String topic) {
        super(name, year, starRating);
        this.topic = topic;
    }

    //getter method
    public String getTopic() {
        return topic;
    }
}
