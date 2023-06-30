package com.arjun.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.arjun"})
public class MyAppconfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
   }
	@Bean
	public JdbcTemplate jdbcTemp() {
		JdbcTemplate jdbcTemp=new JdbcTemplate(dataSource());
		return jdbcTemp;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUsername("root");
		datasource.setPassword("bhararaarjun03");
		datasource.setUrl("jdbc:mysql://localhost:3306/eclipse_project?useSSL=false");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}
}
