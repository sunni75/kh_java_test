package aaaa;

import java.io.IOException;
import java.util.List;

import tmdbwrapper.model.Movie;
import tmdbwrapper.retriever.MovieDataRetriever;

public class Abc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MovieDataRetriever movieDataRetriever = new MovieDataRetriever("daf14385d32e4bd56a9acaff4001de0c");
		Movie someMovie = movieDataRetriever.searchExact("The Dark Knight");
		
		System.out.println(someMovie.getMovieTitle());
		
		List<Movie> list = movieDataRetriever.searchByQuery("Dark Knight");
		// print list
		for (Movie movie : list) {
			System.out.println(movie.getMovieTitle());
		}
	}

}
