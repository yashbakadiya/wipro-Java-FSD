package com.trainingapps.userms.util;

import com.trainingapps.userms.dto.UserToken;
import com.trainingapps.userms.exceptions.IncorrectCredentialsException;
import org.springframework.stereotype.Component;

@Component
public class TokenUtil {

    public String generateToken(String username, String password){
        String token=username+","+password;
        return token;
    }

    public UserToken decode(String token) throws IncorrectCredentialsException{
        String parts[]=token.split(",");
        if(parts.length<2){
            throw new IncorrectCredentialsException("incorrect credentials");
        }
        String username=parts[0];
        String password=parts[1];
        UserToken decoded=new UserToken(username,password);
        return decoded;
    }

}
