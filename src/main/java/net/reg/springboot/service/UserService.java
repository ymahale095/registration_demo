package net.reg.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.reg.springboot.model.User;
import net.reg.springboot.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService

{

	User save(UserRegistrationDto registrationDto);
}

