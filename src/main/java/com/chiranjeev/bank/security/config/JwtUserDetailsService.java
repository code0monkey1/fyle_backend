package com.chiranjeev.bank.security.config;


import com.chiranjeev.bank.utils.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Primary
public class JwtUserDetailsService implements UserDetailsService {

    @Value("${jwt.secret}")
    private String secret;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (secret.equals(username)) {
            return new User(secret, Constants.BCrypt_Password,
                    new ArrayList<>());
        } else throw new  UsernameNotFoundException("The user with name: "+username+" was not found ");
    }

}

