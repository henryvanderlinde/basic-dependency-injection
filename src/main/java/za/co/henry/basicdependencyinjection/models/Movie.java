package za.co.henry.basicdependencyinjection.models;

public class Movie {
    private String title;
    private String description;

    public Movie(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }
}
