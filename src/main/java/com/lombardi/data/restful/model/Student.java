package com.lombardi.data.restful.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent")
    private Long idStudent;

    @Column(name = "studentname")
    private String studentName;

    @Column(name = "studentsurname")
    private String studentSurname;

    @Column(name = "studentage")
    private Integer studentAge;

    @Column(name = "studentclass")
    private Integer studentClass;

    public Student(Long idStudent, String studentName, String studentSurname, Integer studentAge, Integer studentClass) {
        this.idStudent = idStudent;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
        this.studentClass = studentClass;
    }

    public Student() {
    }
}
