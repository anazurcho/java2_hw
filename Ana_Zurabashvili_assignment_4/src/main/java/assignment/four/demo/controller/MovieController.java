package assignment.four.demo.controller;

import assignment.four.demo.dto.movie.*;
import assignment.four.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("addMovie")
    public AddMoviesOutput addMovie(AddMoviesInput addMovieInput){
        return movieService.addMovie(addMovieInput);
    }
    @PostMapping("getMovies")
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput){
        return movieService.getMovies(getMoviesInput);
    }
    @PostMapping("getMovie")
    public GetMovieOutput getMovie(GetMovieInput getMovieInput){
        return movieService.getMovie(getMovieInput);
    }

    @PostMapping("deleteMovie")
    public DeleteMovieOutput deleteMovie(DeleteMovieinput deleteMovieinput){
        return movieService.deleteMovie(deleteMovieinput);
    }

}
