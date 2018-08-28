package com.example.model;

import java.io.Serializable;
import java.time.Instant;

/**
 * audit date
 * 
 * @author jusheng
 * Jun 5, 2018
 * 1:23:40 PM
 */
public abstract class DateAudit implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4707828363411936168L;

	private Instant createdAt;
	
	private Instant updatedAt;

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
