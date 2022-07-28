package com.createiq.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.createiq.dao.UserRepositry;
import com.createiq.model.User;
import com.createiq.service.CustomUserDetailsService;

@Configuration
// @EnableWebSecurity
public class SecurityConfig {

	// @Bean
	// public InMemoryUserDetailsManager userDetailsService() {
	// UserDetails user1 =
	// User.builder().username("balaji").password("balaji").roles("USER")
	// .build();
	// UserDetails user2 =
	// User.builder().username("raja").password("raja").roles("ADMIN")
	// .build();
	// System.out.println(user1.getPassword());
	// System.out.println(user2.getPassword());
	// return new InMemoryUserDetailsManager(user1, user2);
	// }

	// @Bean
	// public InMemoryUserDetailsManager userDetailsService() {
	//
	// UserDetails user1 =
	// User.builder().username("balaji").password(passwordEncoder().encode("balaji")).roles("USER")
	// .build();
	//
	// UserDetails user2 =
	// User.builder().username("raja").password(passwordEncoder().encode("raja")).roles("ADMIN")
	// .build();
	// System.out.println(user1.getPassword());
	// System.out.println(user2.getPassword());
	// return new InMemoryUserDetailsManager(user1, user2);
	// }

	// @Autowired
	// private DataSource dataSource;

	// Enable jdbc authentication

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http.authorizeRequests().antMatchers("/public", "/reg").permitAll().antMatchers("/employee/**")
				.hasAnyRole("USER").antMatchers("/admin/**", "/employee/**").hasAnyRole("ADMIN").anyRequest()
				.authenticated().and().formLogin().permitAll().and().logout().permitAll().and().csrf().disable()
				.build();

	}

	@Bean
	public static PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	// @Bean
	// public static PasswordEncoder passwordEncoder() {
	// return new BCryptPasswordEncoder();
	// }

}
