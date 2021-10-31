package com.msotor.listview02;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.text.AttributedString;

public class Usuario implements Serializable {
    private String userName;
    private String userType;
    private Boolean active;

    public Usuario(String userName, String userType, Boolean active) {
        this.userName = userName;
        this.userType = userType;
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s (%s)", userName, userType);
    }
}
