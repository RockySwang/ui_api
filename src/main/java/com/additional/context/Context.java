package com.additional.context;

import org.springframework.context.annotation.Scope;

/**
 * Created by on 6/4/2018.
 * Store user info in currence request. 
 */
public class Context {

    static final String ATT_KEY = "CONTEXT";

    private Long userId;
    private String ntUsername;
    private String roleName;
    private String userEmail;
    private String userName;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNtUsername() {
        return ntUsername;
    }

    public void setNtUsername(String ntUsername) {
        this.ntUsername = ntUsername;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}