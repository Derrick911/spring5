package com.zzd;

import com.zzd.aop.MyAspectConfig;
import com.zzd.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.zzd")
@EnableAspectJAutoProxy
public class JavaConfig {

	/*@Bean
	public User user(){
		return new User(101,"zhangdzhendong","pwd","18268808714","china");
	}

	@Bean
	public MyAspectConfig aspectConfig(){
		return new MyAspectConfig();
	}*/
}
