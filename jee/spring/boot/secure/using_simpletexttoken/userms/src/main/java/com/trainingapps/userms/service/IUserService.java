package com.trainingapps.userms.service;

import com.trainingapps.userms.dto.LoginUserRequest;
import com.trainingapps.userms.dto.RegisterRequestDto;
import com.trainingapps.userms.dto.UserDetails;
import com.trainingapps.userms.entity.AppUser;
import com.trainingapps.userms.exceptions.IncorrectCredentialsException;
import com.trainingapps.userms.exceptions.UserNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Validated
public interface IUserService {

    UserDetails register(@Valid RegisterRequestDto requestData);

    AppUser findByUserName(@NotEmpty @Length(min = 2, max = 15) String username) throws UserNotFoundException;

    UserDetails findUserDetailsByUserName(@NotEmpty @Length(min = 2, max = 15) String username) throws UserNotFoundException;

    String login(@Valid LoginUserRequest requestData) throws IncorrectCredentialsException;

    AppUser authenticateByToken(@NotBlank String tokenText) throws IncorrectCredentialsException, UserNotFoundException;

    List<UserDetails> findAll();
}
