package com.izdebski;

public interface PeopleBirthday {

    String getFullName(String firstName, String lastName);

    default int getAge(int yearBirthday){
        return 2019 - yearBirthday;
    }
}