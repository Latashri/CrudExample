package com.codedecode.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name="emp")
@Getter
@Setter
public class Employee{
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	private String name;
}