package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;
    private String group;

    public ContactData(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }
}
