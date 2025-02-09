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
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class ConfiguracionUsuarios {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails usuario = User.withDefaultPasswordEncoder()
                .username("usuario")
                .password("contraseña")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(usuario);
    }
}