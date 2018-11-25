package com.lombardi.data.restful.impl.intrface;

import com.lombardi.data.restful.model.Student;

import java.util.List;

public interface IStudent {

    Student getStudent(Long studentId);

    List<Student> getAllStudent();

    Student insertStudent(Student student);

    void deleteStudentById(Long studentId);

    Student updateStudent(Student student);

    default List<Student> retrieveHigherGrades(Long grade) {
        return null;
    }

    default Student nativeInsert(Student student){return null;}
}
