package za.co.henry.basicdependencyinjection.models;

import java.util.ArrayList;
import java.util.List;

public class MovieFinderImpl implements MovieFinder {

    private List<Movie> catalog;

    public MovieFinderImpl() {
        this.catalog = new ArrayList<>();
        catalog.add(new Movie("Matrix", "Description"));
    }

    @Override
    public Movie findByTitle(String title) {
        return catalog.stream()
                .filter(movie -> movie.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }
}
