/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rquimbiulco.moviecatalogservice.model.CatalogItem;
import io.rquimbiulco.moviecatalogservice.model.UserRating;
import io.rquimbiulco.moviecatalogservice.service.MovieInfoService;
import io.rquimbiulco.moviecatalogservice.service.UserRatingInfoService;

/**
 * @author Richard
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	private MovieInfoService movieInfoService;

	@Autowired
	private UserRatingInfoService userRatingInfoService;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		UserRating rating = userRatingInfoService.getUserRating(userId);
		return rating.getRatings().stream().map(rate -> movieInfoService.getCatalogItem(rate))
				.collect(Collectors.toList());
	}

}
