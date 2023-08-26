package com.spring.person.services.servicesInterfaces;

import com.spring.person.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonServicesInterface {

    public List<Person> getAllPersons();

    public Optional<Person>getPersonById(Long id);

    public void savePerson(Person person);


    public void removePersonById(Long id);
}
