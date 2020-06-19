package com.zzd.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

	@Autowired
	IndexService indexService;

	public PersonService() {
		System.out.println("personService " + this);
	}
}
