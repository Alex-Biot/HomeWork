package de.telran.person.controller;

import de.telran.person.dto.PersonDTO;
import de.telran.person.model.Person;
import de.telran.person.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class PersonController {

    final private PersonService personService;

    public PersonController(PersonService personService){

        this.personService = personService;

    }

    @GetMapping("/persons/{id}")
    public PersonDTO get(@PathVariable int id) {

        return new PersonDTO(personService.get(id));}

    @PostMapping("/persons")
    public PersonDTO create(@RequestBody PersonDTO personDTO) {
        Person person = personService.create(personDTO.name, personDTO.secondName, personDTO.age );
        personDTO.id=person.getId();
    return personDTO;}

    @GetMapping("/persons")
    public List<PersonDTO> getAll() {
    List<PersonDTO> personDTOList = new ArrayList (personService.getAll());
    return personDTOList;}

    @PutMapping("/persons/{id}")
    public void edit(@RequestBody PersonDTO personDTO, @PathVariable int id) {
         Person person = personService.get(id);
        if (person == null)
            return;
        person.name = personDTO.name;
       person.secondName = personDTO.secondName;
       person.age=personDTO.age;
    }

    @DeleteMapping("/persons/{id}")
    public PersonDTO delete(@PathVariable int id) {
    PersonDTO personDTO = new PersonDTO(personService.remove(id));
    return personDTO;}


}
