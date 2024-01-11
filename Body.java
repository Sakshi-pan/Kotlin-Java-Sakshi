package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Body {
	private Heart heart;
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void isAlive() {
		heart.pump();
		System.out.println("You are alive");
	}

}
