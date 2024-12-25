package com.javatechie.aws.rds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.aws.rds.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
