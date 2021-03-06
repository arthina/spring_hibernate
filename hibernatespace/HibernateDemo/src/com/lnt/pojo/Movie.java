package com.lnt.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//annotation is gng to be used

@Entity (name="movietab")//movietab table is created in db
public class Movie {
	
	@Id
	private String movieId;
	
	@Column(name="Title" ,length=25)
	private String movieTitle;
	@Column(name="BestActor")//nullable=false
	private String leadActor;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	
	
	

}
