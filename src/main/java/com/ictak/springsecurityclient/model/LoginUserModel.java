package com.ictak.springsecurityclient.model;

import com.ictak.springsecurityclient.entity.Role;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginUserModel {
	@Email(message = "Enter valid email id")
	private String email;
	private String password;
	private Role role;
}
