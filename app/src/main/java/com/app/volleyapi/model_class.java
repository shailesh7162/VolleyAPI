package com.app.volleyapi;

import java.net.URI;

public class model_class
{
    String name;
    String email;
    String body;
    URI uri;

    public model_class(String name, String email, String body) {
        this.name = name;
        this.email = email;
        this.body = body;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "model_class{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                ", uri=" + uri +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
