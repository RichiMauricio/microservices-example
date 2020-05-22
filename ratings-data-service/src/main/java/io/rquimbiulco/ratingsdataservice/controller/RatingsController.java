/**
 * 
 */
package io.rquimbiulco.ratingsdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rquimbiulco.ratingsdataservice.model.Rating;
import io.rquimbiulco.ratingsdataservice.model.UserRating;

/**
 * @author Richard
 *
 */
@RestController
@RequestMapping("/ratingsData")
public class RatingsController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 5);
	}

	@GetMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		userRating.initData(userId);
		return userRating;
	}

}
