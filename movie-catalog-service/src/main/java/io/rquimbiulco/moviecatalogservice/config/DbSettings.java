/**
 * 
 */
package io.rquimbiulco.moviecatalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Richard
 *
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties("db")
public class DbSettings {

	private String connection;
	private String host;
	private int port;

}
