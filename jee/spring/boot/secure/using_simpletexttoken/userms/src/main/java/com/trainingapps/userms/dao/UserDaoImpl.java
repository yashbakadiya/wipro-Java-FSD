package com.trainingapps.userms.dao;

import com.trainingapps.userms.entity.AppUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements IUserDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public AppUser save(AppUser user) {
        user=em.merge(user);
        return user;
    }

    @Override
    public Optional<AppUser> findByUserName(String username) {
        String queryText="from AppUser where username=:usernameArg";
        TypedQuery<AppUser> query=em.createQuery(queryText,AppUser.class);
        query.setParameter("usernameArg",username);
        List<AppUser> list =query.getResultList();
        if(list.isEmpty()){
            Optional<AppUser>optional=Optional.empty();
            return optional;
        }
        AppUser user=list.get(0);
        Optional<AppUser>optional=Optional.of(user);
        return optional;
    }

    @Override
    public List<AppUser>findAll(){
        String queryText="from AppUser";
        TypedQuery<AppUser> query=em.createQuery(queryText,AppUser.class);
        List<AppUser> list =query.getResultList();
         return list;
    }

}
