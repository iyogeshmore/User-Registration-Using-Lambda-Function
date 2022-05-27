package com.bridgelabz;

public class UserRegistrationException extends Exception{
    public ExpectedType type;

    public enum ExpectedType{
        FIRSTNAME, LASTNAME, MOBILENUMBER, EMAIL, PASSWORD
    }

    public UserRegistrationException(String message,ExpectedType type) {
        super(message);
        this.type = type;
    }
}
