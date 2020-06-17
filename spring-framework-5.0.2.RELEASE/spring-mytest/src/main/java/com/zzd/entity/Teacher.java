package com.zzd.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Teacher {
	@Autowired
	private Student student;

	public Teacher (Student student) {
		System.out.println("Teacher init1:" + student);

	}

	public void getStu () {
		System.out.println(student);
	}

}
