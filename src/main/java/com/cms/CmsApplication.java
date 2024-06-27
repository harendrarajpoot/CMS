package com.cms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cms.entities.Role;
import com.cms.entities.User;
import com.cms.repository.UserRepository;

@SpringBootApplication
public class CmsApplication implements CommandLineRunner {
@Autowired
	private UserRepository  userServices ;

/*@Value("${spring.datasource.url}")
private String name;*/

@Autowired
private Environment emEnvironment;

@Autowired
private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);		
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUN Method");
		
		System.out.println(passwordEncoder.matches("$10$AjXjZLHe/kt1OfCQzQ845uBO55l0JlImv0t.HaDPQ0nDPXNCZ8Na2", "Admin"));
		
		
		User user=new User();
		user.setEmail("12@gmail.com");
		user.setFname("FName");
		user.setLname("Lname");
		user.setPassword("1234");
		Role role=new Role();
		role.setName("ADMIN");
		List<Role> roles=new ArrayList<>();
		roles.add(role);
		user.setRoles(roles);
		System.out.println("NOOT");
		//userServices.save(user);
		System.out.println("SAVEd");
		
		System.out.println("spring.datasource.url---->"+emEnvironment.getProperty("spring.datasource.url"));
		
		
		
		
		
	}

}


