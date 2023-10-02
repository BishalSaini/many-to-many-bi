package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave { 
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s1= new Student();
		s1.setName("sabaat");
		s1.setEmail("sabaat25@mail.com");
		
		Student s2= new Student();
		s2.setName("vishu");
		s2.setEmail("vishu32@mail.com"); 
		
		Student s3= new Student();
		s3.setName("v");
		s3.setEmail("v06@mail.com"); 
		
		Student s4= new Student();
		s4.setName("s");
		s4.setEmail("s7@mail.com"); 
		
		
		ArrayList<Student> students=new ArrayList<Student>(); 
		students.add(s1); 
		students.add(s2);
		students.add(s3);
		students.add(s4);

		
		Course c1=new Course();
		c1.setName("WEBTECH");
		c1.setDuration("1 month");
		
		Course c2=new Course();
		c2.setName("JAVA");
		c2.setDuration("2 month");
		
		Course c3=new Course();
		c3.setName("SQL");
		c3.setDuration("2 month");
		
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		s1.setCourses(courses);
		s2.setCourses(courses); 
		s3.setCourses(courses); 
		s4.setCourses(courses);
		
		c1.setStudents(students); 
		c2.setStudents(students); 
		c3.setStudents(students);

		
		entityTransaction.begin();
		entityManager.persist(s1); 
		entityManager.persist(s2); 
		entityManager.persist(s3); 
		entityManager.persist(s4); 
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityTransaction.commit();
	}
	}
