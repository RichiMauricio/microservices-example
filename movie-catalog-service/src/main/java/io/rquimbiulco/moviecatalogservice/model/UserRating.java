/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Richard
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRating {

	private String userId;
	private List<Rating> ratings;

}
