package com.fleaadda.core;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.jolbox.bonecp.BoneCPDataSource;


@Configuration
@PropertySource("classpath:properties/db.properties")
public class ApplicationConfig {
	
	@Resource
	private Environment environment;
	
	@Bean
	public BoneCPDataSource getDataSource(){
		BoneCPDataSource dataSource= new BoneCPDataSource();
		dataSource.setDriverClass(environment.getRequiredProperty("driverName"));
		dataSource.setJdbcUrl(environment.getRequiredProperty("jdbcURL"));
		dataSource.setUsername(environment.getRequiredProperty("username"));
		dataSource.setPassword(environment.getRequiredProperty("password"));
		return dataSource;
	}

}
