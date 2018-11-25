package com.lombardi.data.restful.impl;

import com.lombardi.data.restful.impl.intrface.IStudent;
import com.lombardi.data.restful.model.Student;
import com.lombardi.data.restful.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements IStudent {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student getStudent(Long studentId) {
        return studentRepo.findById(studentId).get();
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepo.save(student);

    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepo.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        Student tempStudent = studentRepo.findById(student.getIdStudent()).get();
        if (tempStudent != null) {
            tempStudent = new Student(student.getIdStudent(), student.getStudentName(), student.getStudentSurname(), student.getStudentAge(), student.getStudentClass());
            return studentRepo.save(tempStudent);
        } else {
            return null;
        }
    }

    public List<Student> retrieveHigherGrades(Long grade) {
        return studentRepo.retrieveHigherGrades(grade);
    }

    public Student nativeInsert(Student student){
        return studentRepo.nativeInsert(student.getStudentName(),student.getStudentSurname(),student.getStudentAge(),student.getStudentClass());
    }


}
