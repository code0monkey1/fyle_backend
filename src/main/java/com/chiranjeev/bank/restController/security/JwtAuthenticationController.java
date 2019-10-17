package com.chiranjeev.bank.restController.security;


import com.chiranjeev.bank.dtos.JwtRequest;
import com.chiranjeev.bank.dtos.JwtResponse;
import com.chiranjeev.bank.security.JwtTokenUtil;
import com.chiranjeev.bank.security.config.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;



@RestController
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;



    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        System.out.println("reaches 1");
        String username=authenticationRequest.getUsername();
        String password=authenticationRequest.getPassword();
        System.out.println( "The username is "+username+ " the password is "+password);

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        System.out.println("reaches 2");
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        System.out.println("reaches 3");
        final String token = jwtTokenUtil.generateToken(userDetails);
        System.out.println("Reaches 4");
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @GetMapping("/hello")
    public String getHello(){
        System.out.println("Does not reach hello");
        return "<h2> Hello</h2>";
    }
    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
