package com.example.model;

import com.additional.enums.RoleName;

/**
 * Role
 * 
 * @author jusheng
 * Jun 5, 2018
 * 1:46:16 PM
 */
public class Role {

	private Long id;
	
	private RoleName name;
	
	public Role() {

    }

    public Role(RoleName name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RoleName getName() {
		return name;
	}

	public void setName(RoleName name) {
		this.name = name;
	}
    
}
