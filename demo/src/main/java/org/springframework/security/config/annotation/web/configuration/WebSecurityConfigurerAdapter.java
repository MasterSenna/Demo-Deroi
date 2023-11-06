package org.springframework.security.config.annotation.web.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface WebSecurityConfigurerAdapter {

	void configure(HttpSecurity http) throws Exception;

	void configure(AuthenticationManagerBuilder auth) throws Exception;

}
