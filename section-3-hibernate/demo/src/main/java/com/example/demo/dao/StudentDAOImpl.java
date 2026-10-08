package com.example.demo.dao;

import com.example.demo.entities.Student;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentDAOImpl implements StudentDAO{

    EntityManager entityManager;

    StudentDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    @Transactional //always use when ur working with database saving/updating/delete etc
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);

    }
}
