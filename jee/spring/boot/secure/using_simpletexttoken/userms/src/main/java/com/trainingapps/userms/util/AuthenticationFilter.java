package com.trainingapps.userms.util;


import com.trainingapps.userms.exceptions.IncorrectCredentialsException;
import com.trainingapps.userms.exceptions.UserNotFoundException;
import com.trainingapps.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthenticationFilter implements Filter {
    @Autowired
    private IUserService service;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest=(HttpServletRequest)servletRequest;
        HttpServletResponse httpResponse=(HttpServletResponse)servletResponse;
        System.out.println("*** inside filter "+httpRequest.getMethod()+"-uri-"+httpRequest.getRequestURI());
        String token=httpRequest.getHeader("token");
        System.out.println("token="+token);
        try {
            service.authenticateByToken(token);
            filterChain.doFilter(servletRequest,servletResponse);
        }catch(IncorrectCredentialsException|UserNotFoundException| ConstraintViolationException e){
            httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
            PrintWriter writer=httpResponse.getWriter();
            writer.write("Incorrect Token, you are unauthorized");

        }


    }
}
