/**
 * 
 */
package io.rquimbiulco.ratingsdataservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Richard
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Rating {

	private String movieId;
	private int ratingValue;
	
}
