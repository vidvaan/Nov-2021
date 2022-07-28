package com.createiq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.createiq.bean.MyUserDetails;
import com.createiq.dao.UserRepositry;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepositry userRepositry;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(userRepositry.findByUname(username));
		MyUserDetails myUserDetails = new MyUserDetails(userRepositry.findByUname(username));
		return myUserDetails;
	}

}
