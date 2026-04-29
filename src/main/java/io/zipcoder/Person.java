package io.zipcoder;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        //TODO: Implement constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        // TODO: Implement getter
        return firstName;
    }

    public void setFirstName(String firstName) {
        // TODO: Implement setter
        this.firstName = firstName;
    }

    public String getLastName() {
        // TODO: Implement getter
        return lastName;
    }

    public void setLastName(String lastName) {
        // TODO: Implement setter
        this.lastName = lastName;
    }

    public String getEmail() {
        // TODO: Implement getter
        return email;
    }

    public void setEmail(String email) {
        // TODO: Implement setter
        this.email = email;
    }

    public String getPhoneNumber() {
        // TODO: Implement getter
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // TODO: Implement setter
        this.phoneNumber = phoneNumber;
    }
}
