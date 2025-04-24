package com.jonathan.demo.application.dto.user;

public class RequestUserDto {
    private String name;

    public RequestUserDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
