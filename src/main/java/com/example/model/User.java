package com.example.model;

import java.util.HashSet;
import java.util.Set;
import com.example.model.DateAudit;

/**
 * @author jusheng
 * Jun 5, 2018
 * 1:43:12 PM
 */
public class User extends DateAudit {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6666133204167937137L;
	
	private Long id;
	private String name;
	private String username;
	private String email;
	private String password;

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}

	private Long roleID;
	private Set<Role> roles = new HashSet<>();
	
	public User() {

    }

	public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
