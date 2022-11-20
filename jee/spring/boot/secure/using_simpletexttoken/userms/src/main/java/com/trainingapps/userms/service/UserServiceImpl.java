package com.trainingapps.userms.service;

import com.trainingapps.userms.dao.IUserDao;
import com.trainingapps.userms.dto.LoginUserRequest;
import com.trainingapps.userms.dto.RegisterRequestDto;
import com.trainingapps.userms.dto.UserDetails;
import com.trainingapps.userms.dto.UserToken;
import com.trainingapps.userms.entity.AppUser;
import com.trainingapps.userms.exceptions.IncorrectCredentialsException;
import com.trainingapps.userms.exceptions.UserNotFoundException;
import com.trainingapps.userms.util.TokenUtil;
import com.trainingapps.userms.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao dao;

    @Autowired
    private UserUtil userUtil;

    @Autowired
    private TokenUtil tokenUtil;

    @Override
    public UserDetails register(RegisterRequestDto requestData) {
        AppUser user = new AppUser();
        user.setUsername(requestData.getUsername());
        user.setPassword(requestData.getPassword());
        user = dao.save(user);
        UserDetails details = userUtil.toUserDetails(user);
        return details;
    }

    @Override
    public AppUser findByUserName(String username) throws UserNotFoundException {
        Optional<AppUser> optional = dao.findByUserName(username);
        if (!optional.isPresent()) {
            throw new UserNotFoundException("user not found for username=" + username);
        }
        AppUser user = optional.get();
        return user;
    }


    @Override
    public UserDetails findUserDetailsByUserName(String username) throws UserNotFoundException {
        AppUser user = findByUserName(username);
        UserDetails details = userUtil.toUserDetails(user);
        return details;
    }

    @Override
    public String login(LoginUserRequest requestData) throws IncorrectCredentialsException {
        authenticate(requestData.getUsername(),requestData.getPassword());
        String token = tokenUtil.generateToken(requestData.getUsername(), requestData.getPassword());
        return token;
    }

    public void authenticate(String username,String password)throws IncorrectCredentialsException {
        Optional<AppUser> optional=dao.findByUserName(username);
        if(!optional.isPresent()){
            throw new IncorrectCredentialsException("incorrect credentials");
        }
        AppUser user=optional.get();
        if(!user.getPassword().equals(password)){
            throw new IncorrectCredentialsException("incorrect credentials");
        }
    }

    @Override
    public  AppUser authenticateByToken(String tokenText) throws IncorrectCredentialsException, UserNotFoundException{
       UserToken token =tokenUtil.decode(tokenText);
       authenticate(token.getUsername(), token.getPassword());
       AppUser user=findByUserName(token.getUsername());
       return user;
    }

    @Override
    public List<UserDetails> findAll() {
      List<AppUser>users=  dao.findAll();
      List<UserDetails>desired=userUtil.toUserDetailsList(users);
      return desired;
    }

}
