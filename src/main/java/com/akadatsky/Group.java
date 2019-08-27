package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Person> persons = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

}
