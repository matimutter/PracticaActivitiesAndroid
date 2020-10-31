package com.programabit.practicaactivities;

public class Contact {
    private String name;
    private String birth;
    private String tel;
    private String email;
    private String description;

    public Contact(String name, String birth, String tel, String email) {
        this.name = name;
        this.birth = birth;
        this.tel = tel;
        this.email = email;
    }

    public Contact(String name, String birth, String tel, String email, String description) {
        this.name = name;
        this.birth = birth;
        this.tel = tel;
        this.email = email;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
