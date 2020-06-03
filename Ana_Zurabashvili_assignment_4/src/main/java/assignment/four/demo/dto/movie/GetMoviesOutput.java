package assignment.four.demo.dto.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movies;
}
