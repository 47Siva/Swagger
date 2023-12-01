package com.Swagger.SpringBootSwagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/swagger/")
public class MovieController {
	private List<Movie> movies = new ArrayList<Movie>();

	@PostMapping("post")
	public Movie addMovies(@RequestBody Movie movie) {

		movies.add(movie);

		return movie;

	}

	@GetMapping("get")
	public List<Movie> getMovies() {
		return movies;
	}
}
