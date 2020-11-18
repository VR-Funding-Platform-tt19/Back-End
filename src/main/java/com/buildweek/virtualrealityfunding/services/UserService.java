package com.buildweek.virtualrealityfunding.services;

import com.buildweek.virtualrealityfunding.models.Investor;
import com.buildweek.virtualrealityfunding.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService
{
    UserDetails loadUserByUsername(String username);

    List<User> findAll();

    User findUserById(long id);

    User findByName(String name);

    void delete(long id);

    User save(User user);

    User update(User user, long id, boolean isAdmin);

    void deleteUserRole(long userid, long roleid);

    void addUserRole(long userid, long roleid);

    //////try to connect the investor to the update the user and
    ///// create the association to the investor
    User addNewInvestor(Investor investor);

    ///adding investor to associate with the user
//    void addNewInvestor(User user);
}