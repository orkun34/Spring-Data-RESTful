package com.lombardi.data.restful.repo;

import com.lombardi.data.restful.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {


    @Query(value = "select * from Student s where s.studentClass >= :studentClass",nativeQuery = true)
    List<Student> retrieveHigherGrades(@Param("studentClass") Long grade);

    @Modifying
    @Query(value=" insert into Student (studentName,studentSurname,studentAge,studentClass) VALUES (:studentName,:studentSurname,:studentAge,:studentClass)" , nativeQuery = true)
    Student nativeInsert(@Param("studentName")String studentName, @Param("studentSurname") String studentSurname, @Param("studentAge")Integer studentAge,@Param("studentClass")Integer studentClass);

}
