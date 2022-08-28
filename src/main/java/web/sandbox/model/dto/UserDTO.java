package web.sandbox.model.dto;

import web.sandbox.annotations.RequiredFieldConstraint;

import java.io.Serializable;

public class UserDTO implements Serializable {

    @RequiredFieldConstraint
    private String firstName;
    @RequiredFieldConstraint
    private String lastName;
    private String token;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
