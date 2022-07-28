package com.createiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.createiq.dao.UserRepositry;
import com.createiq.model.User;

@SpringBootApplication
public class SpringBootRestCrudDataJpaApplication implements CommandLineRunner{
	
	
	@Autowired
	private UserRepositry userRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCrudDataJpaApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user= new User();
		user.setUname("balaji");
		user.setPass("balaji");
		user.setUrole("USER");
		userRepository.save(user);
		
		
		User user2= new User();
		user2.setUname("raja");
		user2.setPass("raja");
		user2.setUrole("ADMIN");
		userRepository.save(user2);
		
	}
	
	

}
