package com.scribble.nbacb.web;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scribble.nbacb.models.NbacbPick;
import com.scribble.nbacb.service.CollegeBasketBallOddsService;

@Path("/nbacb")
@Controller
public class CollegeBasketBallOddsController {

	@Autowired
	private CollegeBasketBallOddsService nbacbService;
	
	@GET
	@Produces("application/json")
	public List<String> getCollegeBasketBallOdds() throws IOException
	{
		return nbacbService.getNbacbOdds();
	}
}
