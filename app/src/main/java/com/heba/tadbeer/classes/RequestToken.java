package com.heba.tadbeer.classes;

/**
 * Created by bello on 3/4/16.
 */
public class RequestToken {
    private String token;
    private boolean authorized;

    public RequestToken(String token, boolean authorized) {
         this.authorized = authorized;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
}
