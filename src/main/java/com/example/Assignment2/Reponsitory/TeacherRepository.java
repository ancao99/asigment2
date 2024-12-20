package com.example.Assignment2.Reponsitory;

import com.example.Assignment2.Entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Teacher> findByStudentId(int studentId) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "SELECT t FROM Teacher t JOIN t.students s WHERE s.id = :studentId";
            return session.createQuery(hql, Teacher.class)
                    .setParameter("studentId", studentId)
                    .getResultList();
        }
    }
}
