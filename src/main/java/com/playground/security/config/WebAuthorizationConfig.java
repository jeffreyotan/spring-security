package com.playground.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration // Replacing with ProjectConfig
public class WebAuthorizationConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
            (authz) -> authz.anyRequest().authenticated()
        ).httpBasic(Customizer.withDefaults());
        
        return http.build();
    }
}
