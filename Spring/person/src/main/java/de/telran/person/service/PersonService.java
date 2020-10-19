package de.telran.person.service;

import de.telran.person.model.Person;
import de.telran.person.repo.IPersonRepo;
import de.telran.person.repo.MemoryPersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
   final private IPersonRepo memoryPersonRepo;

    public PersonService(IPersonRepo memoryPersonRepo) {
        this.memoryPersonRepo = memoryPersonRepo;
    }

    public Person create(String name, String secondName,int age){
        Person person = new Person(name);
        person.secondName = secondName;
        person.age = age;

    return person;}

    public List<Person> getAll(){
        return memoryPersonRepo.findAll();
    }
    public void add(Person person){
        memoryPersonRepo.save(person);
    }
    public Person remove(int id){
       return memoryPersonRepo.remove(id);
    }

    public Person get(int id) {
        return memoryPersonRepo.find(id);
    }
}
