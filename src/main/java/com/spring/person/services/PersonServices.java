package com.spring.person.services;

import com.spring.person.Repository.PersonRepository;
import com.spring.person.model.Person;
import com.spring.person.services.servicesInterfaces.PersonServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServices implements PersonServicesInterface {

    @Autowired
    PersonRepository personRepository;
    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }


    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void removePersonById(Long id) {
        personRepository.deleteById(id);

    }
}
