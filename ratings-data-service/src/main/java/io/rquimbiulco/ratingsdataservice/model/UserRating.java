/**
 * 
 */
package io.rquimbiulco.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Richard
 *
 */
@Getter
@Setter
public class UserRating {

	private String userId;
	private List<Rating> ratings;

	public void initData(String userId) {
		this.setUserId(userId);
		this.setRatings(Arrays.asList(new Rating("100", 3), new Rating("200", 4)));
	}
}
