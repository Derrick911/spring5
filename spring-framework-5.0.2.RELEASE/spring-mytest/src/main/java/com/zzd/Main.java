package com.zzd;

import com.zzd.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


	public static void main(String[] args){

		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("getBean入口");
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());

	}



}
