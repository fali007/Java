package com.example.demo;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;

@Component
//@Scope(value="prototype")
public class alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private laptop lap;
	
	public alien() {
		super();
		System.out.println("Object Created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public laptop getLap() {
		return lap;
	}
	public void setLap(laptop lap) {
		this.lap = lap;
	}
	public void show() {
		System.out.println("In show...");
		lap.compile();
	}
	
	
}
