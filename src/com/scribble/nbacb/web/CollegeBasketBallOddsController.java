package com.scribble.nbacb.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scribble.nbacb.models.NbacbPrediction;
import com.scribble.nbacb.service.CollegeBasketBallOddsService;

@Path("/nbacb")
@Controller
public class CollegeBasketBallOddsController {

	@Autowired
	private CollegeBasketBallOddsService nbacbService;
	
	@GET
	@Produces("application/json")
	public List<NbacbPrediction> getCollegeBasketBallOdds() throws IOException, ParseException
	{
		return nbacbService.getMatchesByDate(new Date());
	}
	
	@GET
	@Path("{date}")
	@Produces("application/json")
	public List<NbacbPrediction> getMatchesByDate(@PathParam("date") String matchDate) throws IOException, ParseException
	{
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date eventDate = format.parse(matchDate);
		
		return nbacbService.getMatchesByDate(eventDate);
	}
}
