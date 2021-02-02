package com.cg.hsm.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int roleId;
	/*
	 * username of users
	 */
	private String username;
	/*
	 * password of users
	 */
	
	private String password;
	

	/*
	 * role of accessor
	 */
	private String roleName;

	private Date updatedDate;
	
	
	public Role() {
		super();
	}

	public Role(int roleId, String username, String password, String roleName, Date updatedDate) {
		super();
		this.roleId = roleId;
		this.username = username;
		this.password = password;
		this.roleName = roleName;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", username=" + username + ", password=" + password + ", roleName=" + roleName
				+ ", updatedDate=" + updatedDate + "]";
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
