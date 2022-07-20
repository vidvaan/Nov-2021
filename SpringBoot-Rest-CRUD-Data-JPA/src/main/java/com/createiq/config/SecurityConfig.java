package com.createiq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class SecurityConfig {
	
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails user1 = User.builder().username("balaji").password("{noop}balaji").roles("USER")
				.build();
		UserDetails user2 = User.builder().username("raja").password("{noop}raja").roles("ADMIN")
				.build();
		System.out.println(user1.getPassword());
		System.out.println(user2.getPassword());
		return new InMemoryUserDetailsManager(user1, user2);
	}

	

//	@Bean
//	public InMemoryUserDetailsManager userDetailsService() {
//
//		UserDetails user1 = User.builder().username("balaji").password(passwordEncoder().encode("balaji")).roles("USER")
//				.build();
//
//		UserDetails user2 = User.builder().username("raja").password(passwordEncoder().encode("raja")).roles("ADMIN")
//				.build();
//		System.out.println(user1.getPassword());
//		System.out.println(user2.getPassword());
//		return new InMemoryUserDetailsManager(user1, user2);
//	}

//	@Autowired
//	private DataSource dataSource;

	// Enable jdbc authentication
//	@Autowired
//	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication().dataSource(dataSource);
//	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.authorizeRequests().antMatchers("/public","/reg").permitAll().antMatchers("/employee/**")
				.hasAnyRole("USER").antMatchers("/admin/**", "/employee/**").hasAnyRole("ADMIN").anyRequest()
				.authenticated().and().formLogin().permitAll().and().logout().permitAll().and().csrf().disable()
				.build();

	}

	// @Bean
	// public static PasswordEncoder passwordEncoder() {
	// return NoOpPasswordEncoder.getInstance();
	// }

//	@Bean
//	public static PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
