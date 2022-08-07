package com.config;

import com.service.CustomAuthenticationProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = {"com.dao","com.service","com.controller"})
public class AppSecurityConfig{

    private final CustomAuthenticationProvider customAuthenticationProvider;

    public AppSecurityConfig(CustomAuthenticationProvider customAuthenticationProvider) {
        this.customAuthenticationProvider = customAuthenticationProvider;
    }

    public HttpSecurity httpSecurity(HttpSecurity http) throws Exception {
        return http
                .formLogin(Customizer.withDefaults())
                .logout()
                .permitAll()
                .and()
                .authenticationProvider(customAuthenticationProvider);
    }
}
