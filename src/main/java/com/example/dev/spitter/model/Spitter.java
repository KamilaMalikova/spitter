package com.example.dev.spitter.model;

public class Spitter {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private boolean updatedByEmail;

    public Spitter() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUpdatedByEmail(boolean updatedByEmail) {
        this.updatedByEmail = updatedByEmail;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isUpdatedByEmail() {
        return updatedByEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
