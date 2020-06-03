package assignment.four.demo.service;

import assignment.four.demo.dto.movie.*;

public interface MovieService {
    //ფილის დამატება
    AddMoviesOutput addMovie(AddMoviesInput addMovieInput);
//    ფილმების წამოღება
    GetMoviesOutput getMovies(GetMoviesInput getMoviesInput);
//    ფილმის წამოღება
    GetMovieOutput getMovie(GetMovieInput getMovieInput);
//    წაშლა
    DeleteMovieOutput deleteMovie(DeleteMovieinput deleteMovieinput);
}
