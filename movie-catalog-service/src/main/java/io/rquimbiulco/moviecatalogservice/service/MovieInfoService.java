/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.rquimbiulco.moviecatalogservice.model.CatalogItem;
import io.rquimbiulco.moviecatalogservice.model.Movie;
import io.rquimbiulco.moviecatalogservice.model.Rating;

/**
 * @author Richard
 *
 */
@Service
public class MovieInfoService {

	@Autowired
	private WebClient.Builder webclientBuilder;

	/**
	 * @param rate
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "getFallbackCatalogItem")
	public CatalogItem getCatalogItem(Rating rate) {
		Movie movie = webclientBuilder.build().get().uri("http://movie-info-service/movies/" + rate.getMovieId())
				.retrieve().bodyToMono(Movie.class).block();
		return new CatalogItem(movie.getName(), "descripcion test", rate.getRatingValue());
	}

	public CatalogItem getFallbackCatalogItem(Rating rate) {
		return new CatalogItem("pelicula no encontrada", "", 0);
	}

}
