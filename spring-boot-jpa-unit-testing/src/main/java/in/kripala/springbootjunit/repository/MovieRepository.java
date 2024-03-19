package in.kripala.springbootjunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kripala.springbootjunit.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenere(String genera);
}
