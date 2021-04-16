import com.devsfast.movie.Library;
import com.devsfast.movie.Movie;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DonateMovieTest {

    private final Library library;
    private final Movie movie;

    public DonateMovieTest() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    void movieAddedToCatalog() {
        library.donate(movie);
        assertThat(library.getCatalogue().contains(movie)).isEqualTo(true);

    }

    @Test
    void rentalCopyAdded() {
        library.donate(movie);
        assertThat(movie.getCopies()).isEqualTo(1);
    }
}
