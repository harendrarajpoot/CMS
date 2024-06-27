package com.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {

	/*No password encorder
	 * @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("admin");
		//auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("user");
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("admin");
		auth.inMemoryAuthentication().withUser("user").password("user").roles("user");
	}*/
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password(getPasswordEncoder().encode("admin")).roles("admin");
		auth.inMemoryAuthentication().withUser("user").password(getPasswordEncoder().encode("user")).roles("user");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
		.antMatchers("/","js/**","css/**").permitAll()
		.antMatchers("/admin/**").hasAnyRole("admin").
		and().httpBasic().and().formLogin();
	}
	
	/* no password encode
	 @Bean
	PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}*/
	
	@Bean
	PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
