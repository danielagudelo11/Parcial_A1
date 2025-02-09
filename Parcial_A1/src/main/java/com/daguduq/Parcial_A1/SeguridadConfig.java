/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daguduq.Parcial_A1;

/**
 *
 * @author danie
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SeguridadConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/publico").permitAll()  
                .anyRequest().authenticated()            
            )
            .formLogin(Customizer.withDefaults())  // Habilitar formulario de inicio de sesión
            .httpBasic(Customizer.withDefaults());  // Habilitar autenticación básica
        return http.build();
    }
}