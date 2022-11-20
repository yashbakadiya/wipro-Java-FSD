package com.trainingapps.userms.util;

import com.trainingapps.userms.dto.UserDetails;
import com.trainingapps.userms.entity.AppUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class UserUtil {
    public UserDetails toUserDetails(AppUser user){
        UserDetails details = new UserDetails();
        details.setId(user.getId());
        details.setUsername(user.getUsername());
        details.setPassword(user.getPassword());
        return details;
    }

    public List<UserDetails> toUserDetailsList(Collection<AppUser> users){
       List<UserDetails>desired=new ArrayList<>();
       for (AppUser user:users){
         UserDetails details=  toUserDetails(user);
         desired.add(details);
       }
       return desired;
    }
}
