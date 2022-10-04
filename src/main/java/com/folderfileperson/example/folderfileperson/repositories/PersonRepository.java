package com.folderfileperson.example.folderfileperson.repositories;

import com.folderfileperson.example.folderfileperson.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
