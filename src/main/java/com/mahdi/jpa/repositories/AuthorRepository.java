package com.mahdi.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mahdi.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>,
 JpaSpecificationExecutor<Author>{

    List<Author> findAllByFirstName(String fn);


    List<Author> findAllByFirstNameIgnoreCase(String fn);

    
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);


    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);


     List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    
}
