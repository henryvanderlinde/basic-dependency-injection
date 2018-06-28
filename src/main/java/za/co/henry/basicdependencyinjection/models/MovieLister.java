package za.co.henry.basicdependencyinjection.models;

public class MovieLister {

    private final MovieFinder movieFinder;

    public MovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public Movie findMovieByTitle(String title) {
        return this.movieFinder.findByTitle(title);
    }
}
