package com.additional.enums;

/**
 * RoleName
 *
 * @author jusheng
 * Jun 5, 2018
 * 1:47:28 PM
 */
public enum RoleName {

  ROLE_USER(2L,RoleName.ROLE_USER_NAME),
  ROLE_ADMIN(1L,RoleName.ROLE_ADMIN_NAME);
  RoleName(Long roleId,String roleName)
  {
    this.roleId=roleId;
    this.roleName=roleName;
  }

  public Long getRoleId() {
    return roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  private Long roleId;
  private String roleName;

  public final static String ROLE_USER_NAME = "user";
  public final static String ROLE_ADMIN_NAME = "admin";
}