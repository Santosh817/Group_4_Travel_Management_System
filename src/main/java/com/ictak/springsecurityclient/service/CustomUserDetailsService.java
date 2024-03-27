package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.CustomUserDetails;
import com.ictak.springsecurityclient.entity.User;
import com.ictak.springsecurityclient.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user;
		try {
			user = userRepository.findByEmailId(emailId);
		} catch (Exception e) {
			// TODO: handle exception
			throw new UsernameNotFoundException("User Name Not Found");
		}
		return new CustomUserDetails(user);
	}

}
