package de.telran.person.dto;

import de.telran.person.model.Person;

//Data transfer object
public class PersonDTO {

    public int id;
    public String name;
    public String secondName;
    public int age;

    public PersonDTO(Person person) {
        this.id = person.id;
        this.name = person.name;
        this.secondName = person.secondName;
        this.age = person.age;
    }
}
