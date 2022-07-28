package com.javainuse;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenPassword {
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("javainuse"));
	}

}
