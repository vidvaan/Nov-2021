package com.createiq.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.createiq.model.User;

public class MyUserDetails implements UserDetails {

	private User user;

	public MyUserDetails(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		GrantedAuthority grantedAuthority =  () -> user.getUrole();
		Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(grantedAuthority);
		return roles;
	}

	@Override
	public String getPassword() {
		return user.getPass();
	}

	@Override
	public String getUsername() {
		return user.getUname();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
