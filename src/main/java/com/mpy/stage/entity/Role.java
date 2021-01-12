package com.mpy.stage.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @ClassName Role
 * @Description: 角色实体
 * @Author: qgm
 * @Date: 2021/1/12 11:43
 * @Version: 1.0
 */
@ApiModel(value = "角色实体类")
public class Role implements Serializable {

    private static final long serialVersionUID = 4506042108975770762L;

    private Integer roleId;

    private String roleName;

    private String description;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
