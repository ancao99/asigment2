package com.example.Assignment2.Reponsitory;

import com.example.Assignment2.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Student> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Student", Student.class).list();
        }
    }

    public List<Student> findByAge(int age) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Student WHERE age = :age", Student.class)
                    .setParameter("age", age)
                    .list();
        }
    }

    public void save(Student student) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.saveOrUpdate(student);
            tx.commit();
        }
    }

    public void deleteById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.delete(student);
            }
            tx.commit();
        }
    }
}

