package com.createiq.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages= {"com.createiq"})
@PropertySource(value = { "db.properties" })
public class SpringConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public BasicDataSource basicDataSource() {		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(env.getProperty("driver"));
		basicDataSource.setUrl(env.getProperty("url"));
		basicDataSource.setUsername(env.getProperty("uname"));
		basicDataSource.setPassword(env.getProperty("pass"));
		return basicDataSource;
	}

}
