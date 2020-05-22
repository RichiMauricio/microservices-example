/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.model;

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
public class Rating {

	private String movieId;
	private int ratingValue;
	
}
