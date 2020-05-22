/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.rquimbiulco.moviecatalogservice.model.Rating;
import io.rquimbiulco.moviecatalogservice.model.UserRating;

/**
 * @author Richard
 *
 */
@Service
public class UserRatingInfoService {

	@Autowired
	private WebClient.Builder webclientBuilder;

	/**
	 * @param userId
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "getFallbackUserRating")
	public UserRating getUserRating(String userId) {
		return webclientBuilder.build().get().uri("http://ratings-data-service/ratingsData/users/" + userId).retrieve()
				.bodyToMono(UserRating.class).block();
	}

	public UserRating getFallbackUserRating(String userId) {
		UserRating userRating = new UserRating();
		userRating.setUserId(userId);
		userRating.setRatings(Arrays.asList(new Rating("0", 0)));
		return userRating;
	}
}
