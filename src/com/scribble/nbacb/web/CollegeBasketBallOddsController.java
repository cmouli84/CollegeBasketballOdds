package com.scribble.nbacb.web;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scribble.nbacb.models.NbacbPrediction;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.service.CollegeBasketBallOddsService;

@Path("/nbacb")
@Controller
public class CollegeBasketBallOddsController {

	@Autowired
	private CollegeBasketBallOddsService nbacbService;
	
	@GET
	@Produces("application/json")
	public List<NbacbPrediction> getCollegeBasketBallOdds() throws IOException
	{
		return nbacbService.getNbacbOdds();
	}
	
	@GET
	@Path("{date}")
	@Produces("application/json")
	public List<Event> getMatchesByDate(@PathParam("date") String matchDate) throws IOException
	{
		return nbacbService.getMatchesByDate(matchDate);
	}
}
