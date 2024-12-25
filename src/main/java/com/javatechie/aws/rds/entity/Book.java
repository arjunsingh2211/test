package com.javatechie.aws.rds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;

}
