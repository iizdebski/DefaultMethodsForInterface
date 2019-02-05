package com.izdebski;

public class Main {

    private static PeopleBirthday peopleBirthday = new PeopleBirthdayImpl();

    public static void main(String[] args) {
        System.out.println("-- Default Method Interface --");
        System.out.println(peopleBirthday.getFullName("Peter", "Petrenko"));
        System.out.println(peopleBirthday.getAge(1992));
    }
}
