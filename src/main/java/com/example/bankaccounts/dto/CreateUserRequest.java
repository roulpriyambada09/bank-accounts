package com.example.bankaccounts.dto;

public class CreateUserRequest {
    private final String name;
    private final String email;
    private final String phone;

    public CreateUserRequest(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
