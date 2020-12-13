package com.example.webforecast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.webforecast.exception.BadRequestFoundException;
import com.example.webforecast.model.Request;
import com.example.webforecast.model.Response;
import com.example.webforecast.service.jwtDetailsService;

/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:24
 **/

@RestController
@CrossOrigin
public class AuthentiactionController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private com.example.webforecast.configuraions.TokenUtil TokenUtil;

	@Autowired
	private jwtDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody Request authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = TokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new Response(token));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		} catch (Exception e) {
		  throw new BadRequestFoundException("Bad Request");
		}
	}
	
	/* Index page returns the HTML templates*/ 
	
	@RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}