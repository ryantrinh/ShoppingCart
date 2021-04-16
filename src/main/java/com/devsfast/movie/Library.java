package com.devsfast.movie;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

    private final ArrayList<Movie> catalogue = new ArrayList<>();

    public void donate(Movie movie) {
        catalogue.add(movie);
        movie.addCopy();
    }

    public boolean contains(Movie movie) {
        return catalogue.contains(movie);
    }

    public Collection<Movie> getCatalogue() {
        return catalogue;
    }
}
