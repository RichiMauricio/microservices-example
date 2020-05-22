package io.rquimbiulco.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rquimbiulco.movieinfoservice.resources.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test movie");
	}
}
