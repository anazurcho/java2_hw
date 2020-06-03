package assignment.four.demo.repository;

import assignment.four.demo.DemoApplication;
import assignment.four.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
