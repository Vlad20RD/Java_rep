package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;

    public ContactData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
