package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.User;
import com.ictak.springsecurityclient.entity.VerificationToken;
import com.ictak.springsecurityclient.model.UserModel;
import com.ictak.springsecurityclient.model.UserProfile;

public interface UserService {

	User registerUser(UserModel userModel);

	String validateVerificationToken(String token);

	VerificationToken generateNewVerificationToken(String oldToken);

	void saveVerificationTokenForUser(String token, User user);

	Boolean existsByEmail(String email);

	UserProfile getUserProfile(Long id);

	UserProfile updateUserProfile(Long id, UserProfile userProfile);

	void deleteUserProfile(Long id);

	UserProfile getUserProfile(String email);

	VerificationToken getVerificationTokenForUser(Long id);

	
}
