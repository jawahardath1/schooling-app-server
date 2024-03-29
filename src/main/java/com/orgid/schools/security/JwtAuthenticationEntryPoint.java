/**
 * 
 */
package com.orgid.schools.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * @author Jawahar Dath Thangirala
 * Sep 9, 2019
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
	
	private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationEntryPoint.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse httpServletResponse,
			AuthenticationException authException) throws IOException, ServletException {
		
		 logger.error("Responding with unauthorized error. Message - {}", authException.getMessage());
	        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
	}

}
