package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @Document(collection="felixMoviesList")
public class movieObj {
	private String name;
	private float rating;
	private int year;
	
	public movieObj(String name, float rating, int year){
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	public float getRating() {
		return this.rating;
	}
}
