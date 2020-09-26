package com.utc.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am Maths Tecaher");
	}

}
