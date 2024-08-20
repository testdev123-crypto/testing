package com.example.School.dto;

public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String roleId;
    private String userDetailId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(String userDetailId) {
        this.userDetailId = userDetailId;
    }


    public UserDTO(String id, String name, String email, String phoneNumber, String roleId, String userDetailId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.roleId = roleId;
        this.userDetailId = userDetailId;
    }

    public UserDTO() {
    }
}
