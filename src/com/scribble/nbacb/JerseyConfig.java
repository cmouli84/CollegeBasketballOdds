package com.scribble.nbacb;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.scribble.nbacb.web.CollegeBasketBallOddsController;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(CollegeBasketBallOddsController.class);
	}

}