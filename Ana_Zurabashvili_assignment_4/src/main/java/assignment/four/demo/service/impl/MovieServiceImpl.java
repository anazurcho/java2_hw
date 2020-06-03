package assignment.four.demo.service.impl;

import assignment.four.demo.dto.movie.*;
import assignment.four.demo.model.Movie;
import assignment.four.demo.repository.MovieRepository;
import assignment.four.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput){
        List<MovieDTO> movieDTOList = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOList.add(movieDTO);
        }

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        getMoviesOutput.setMovies(movieDTOList);
        return getMoviesOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieinput deleteMovieinput) {
        Movie movie = movieRepository.getOne(deleteMovieinput.getMovieId());
        movieRepository.delete(movie);

        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("ფილმი წარმატებით წაიშალა");
        return deleteMovieOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getMovieId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setId(movie.getId());
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());

        return getMovieOutput;
    }

    @Override
    public AddMoviesOutput addMovie(AddMoviesInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());

        movieRepository.save(movie);
        AddMoviesOutput addMoviesOutput=new AddMoviesOutput();
        addMoviesOutput.setMsg("ფილმი წარმატებით დაემატა");
        return addMoviesOutput;
    }

}
