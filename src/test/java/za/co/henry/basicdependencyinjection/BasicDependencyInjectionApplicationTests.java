package za.co.henry.basicdependencyinjection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.henry.basicdependencyinjection.models.Movie;
import za.co.henry.basicdependencyinjection.models.MovieFinder;
import za.co.henry.basicdependencyinjection.models.MovieFinderImpl;
import za.co.henry.basicdependencyinjection.models.MovieLister;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicDependencyInjectionApplicationTests {

    MovieLister movieLister;

    @Before
    public void setUp() {
        MovieFinder finder = new MovieFinderImpl();
        this.movieLister = new MovieLister(finder);
    }

    @Test
    public void findMatrixMovie() {
        Movie movie = this.movieLister.findMovieByTitle("Matrix");

        assert (movie != null);
    }

}