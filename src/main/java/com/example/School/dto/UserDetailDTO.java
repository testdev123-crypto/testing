package com.example.School.dto;

public class UserDetailDTO {
    private String id;
    private String address;
    private String father;
    private String mother;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }






    public UserDetailDTO(String id, String address, String father, String mother) {
        this.id = id;
        this.address = address;
        this.father = father;
        this.mother = mother;

    }

    public UserDetailDTO() {
    }
}
