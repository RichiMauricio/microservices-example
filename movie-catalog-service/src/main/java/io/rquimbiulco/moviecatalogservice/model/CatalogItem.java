/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.model;

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
public class CatalogItem {

	private String name;
	private String description;
	private int rating;

}
