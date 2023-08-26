package com.spring.person.Repository;

import com.spring.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person,Long> {
}
