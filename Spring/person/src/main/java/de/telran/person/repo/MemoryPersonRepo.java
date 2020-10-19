package de.telran.person.repo;

import de.telran.person.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class MemoryPersonRepo implements IPersonRepo{
    private final List<Person> personList = new ArrayList<>();
    private final AtomicInteger atomicInteger = new AtomicInteger();


    @Override
    public void save(Person person) {
        person.setId(atomicInteger.incrementAndGet());
        personList.add(person);

    }

    @Override
    public Person find(int id) {

        return personList.stream().filter(person -> person.id==id)
                .findFirst().orElse(null);
    }

    @Override
    public Person remove(int id) {
        Person person1 = find(id);
         personList.removeIf(person -> person.id==id);
    return person1;}

    @Override
    public List<Person> findAll() {
        return Collections.unmodifiableList(personList) ;
    }

}
