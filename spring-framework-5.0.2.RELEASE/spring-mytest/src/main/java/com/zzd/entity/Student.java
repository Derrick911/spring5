package com.zzd.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Student {


	public Student () {
		System.out.println("Student init:" );
	}

	public void learn () {
		System.out.println("Student learn");
	}
}
