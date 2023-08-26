package com.spring.person.controller;

import com.spring.person.model.Person;
import com.spring.person.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/system")
//http://localhost:8080/system
public class PersonController {

    @Autowired
    PersonServices personServices;

    @GetMapping("/persons")
    //http://localhost:8080/system/persons
    public List<Person> getAllPersons(){
        return personServices.getAllPersons();
    }

    @GetMapping("/person")
    //http://localhost:8080/system/persons
    public Optional<Person> getPersonById(@RequestParam Long id){
        return personServices.getPersonById(id);
    }
    @PostMapping("/persons")
    //http://localhost:8080/system/persons
    public Person addPerson(@RequestBody Person person){
        personServices.savePerson(person);
        return person;
    }
    @DeleteMapping("/persons")
    //http://localhost:8080/system/persons?id=
    public void deletePerson(@RequestParam Long id){
        personServices.removePersonById( id);
    }

    @PutMapping("/persons")
    //http://localhost:8080/system/persons?id=
    public Person updatePerson(@RequestBody Person person,@RequestParam Long id){
        person.setId(id);
        personServices.savePerson(person);
        return person;
    }

}
