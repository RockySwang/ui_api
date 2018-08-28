package com.example.service;

import java.util.HashMap;
import java.util.List;

import com.example.model.JobUserDTO;
import com.example.model.User;

public interface IUserService {

    /**
     * validate the user is or not Admin.
     */
    boolean isAdmin(Long userId);
    int insertUserInfo(String userName,String userNt,String roleName,String userEmail);
    List<JobUserDTO> getUserList();
    //List<appDTO> app();
    //List<jobDTO> job(String app);
    List<Integer> readSize();
    List<Integer> writeSize();
    Long fetchUserId(String userName);
    int switchRoleToAdmin(Long userId);
    //void createUser(User user);
    User getUser(String userName);
}