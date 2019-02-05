package com.izdebski;

public class PeopleBirthdayImpl implements PeopleBirthday {
    @Override
    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
