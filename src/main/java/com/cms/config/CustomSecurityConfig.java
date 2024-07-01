package com.cms.config;



import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
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
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password(getPasswordEncoder().encode("admin")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password(getPasswordEncoder().encode("user")).roles("USER");
	}*/
	
	
	
	
	    @Bean
	    public UserDetailsService userDetailsService() {
	        return new CustomUserDetailsService();
	    }
	     
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	     
	    @Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	        authProvider.setUserDetailsService(userDetailsService());
	        authProvider.setPasswordEncoder(passwordEncoder());
	         
	        return authProvider;
	    }
	 
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.authenticationProvider(authenticationProvider());
	    }
	 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http
        .authorizeRequests()
            .antMatchers("/login").permitAll() // Allow access to the login page
            .anyRequest().authenticated() // All other requests require authentication
            .and()
        .formLogin()
            .loginPage("/login") // Specify the custom login page
            .defaultSuccessUrl("/home", true) // Redirect after successful login
            .failureUrl("/login?error") // Redirect after failed login
            .permitAll() // Allow access to login processing URL
            .and()
        .logout()
            .permitAll(); // Allow access to logout URL
            
           */
		
		

		http.csrf().disable();
		http.authorizeRequests()
		.antMatchers("/","js/**","css/**").permitAll()
		.antMatchers("/auth/user/registration").permitAll()
		.antMatchers("/auth/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/auth/user/**").hasAnyRole("USER","ADMIN")
		
		
		.and().httpBasic()
		.and()
		.formLogin()
		.loginPage("/authentication/login")
		;
		
		
		/*.loginProcessingUrl("/auth/admin/loginprocess")// after submit username and password then login button then process the req
		.defaultSuccessUrl("/auth/admin/dashboard")// if credentials correct then redirect to dashboard page
		.failureUrl("/auth/admin/login?error=true")
		.and()
		.logout()
		.logoutSuccessUrl("/auth/admin/login?logout=true")
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID")
		.permitAll();*/
		
		
		
		
		
		
		
		
		  //@formatter:off
	  /*  http.authorizeRequests()
	        .antMatchers("/login").permitAll()
	        .antMatchers("/**").hasAnyRole("USER", "ADMIN")
	        .antMatchers("/admin/**").hasAnyRole("ADMIN")
	        .and()
	          .formLogin()
	          .loginPage("/login")
	          .loginProcessingUrl("/process-login")
	          .defaultSuccessUrl("/home")
	          .failureUrl("/login?error=true")
	          .permitAll()
	        .and()
	          .logout()
	          .logoutSuccessUrl("/login?logout=true")
	          .invalidateHttpSession(true)
	          .deleteCookies("JSESSIONID")
	          .permitAll()
	        .and()
	          .csrf()
	          .disable();
	    //@formatter:on
*/	 
		
	}
	
	/* no password encode
	 @Bean
	PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}*/
	
	
}
