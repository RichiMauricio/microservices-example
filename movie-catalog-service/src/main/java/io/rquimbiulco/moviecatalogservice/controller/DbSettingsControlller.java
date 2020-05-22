package io.rquimbiulco.moviecatalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.rquimbiulco.moviecatalogservice.config.DbSettings;

@RestController
@RefreshScope
@RequestMapping("/dbSettings")
public class DbSettingsControlller {

	@Autowired
	private DbSettings dbSettings;

	@GetMapping("/getDbSettings")
	public String getDbSettings() {
		return "Connection: " + dbSettings.getConnection() + " host: " + dbSettings.getHost() + " port: "
				+ dbSettings.getPort();
	}

}
