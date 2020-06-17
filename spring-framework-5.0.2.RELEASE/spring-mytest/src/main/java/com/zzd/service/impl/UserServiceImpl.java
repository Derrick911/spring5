package com.zzd.service.impl;

import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl {



	public String getInfo() {
		System.out.println("方法返回");
		return "hello";
	}
}
