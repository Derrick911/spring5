package com.zzd;

import com.zzd.aop.MyAspectConfig;
import com.zzd.entity.Teacher;
import com.zzd.ioc.IndexService;
import com.zzd.service.impl.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

public class Application {

	public static void main(String[] args){

		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		ac.getBean(UserServiceImpl.class).getInfo();
		System.out.println("====================AOP====================");
		ac.getBean(IndexService.class).getMsg();

		//User user = (User) ac.getBean("user");
		//System.out.println(user.toString());
		//Teacher teacher = (Teacher)ac.getBean("teacher");
		//teacher.getStu();
		//System.out.println(userService.getInfo());



	}



}
