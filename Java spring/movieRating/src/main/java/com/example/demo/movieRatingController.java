package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class movieRatingController {
	@Autowired
	private userMongoRepository felixMoviesList;
	public Logger log = LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value = "Hello World", tags = "data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 400, message = "Invalid uri"), @ApiResponse(code = 404, message = "not found"),
			@ApiResponse(code = 405, message = "Validation exception") })
	@GetMapping("/index")
	public String home() {
		return "movie rating services";
	}
	
	@ApiOperation(value = "Get movie rating", tags = "data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 400, message = "Invalid uri"), @ApiResponse(code = 404, message = "not found"),
			@ApiResponse(code = 405, message = "Validation exception") })
	@GetMapping("/movie/{name}")
	public float getRating(@PathVariable String name) {
		Optional<movieObj> val=felixMoviesList.findByName(name);
		if(val.isPresent()){
			return val.get().getRating();
		}
		return 0;
	}
}
