package com.zzd.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {


	@Autowired
	PersonService personService;

	public IndexService() {
		System.out.println("indexService " + this);
	}

	public void getMsg(){
		System.out.println("index login");
	}
}
