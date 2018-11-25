package com.lombardi.data.restful.rest;

import com.lombardi.data.restful.impl.intrface.IStudent;
import com.lombardi.data.restful.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerBase {

    @Autowired
    IStudent studentIntrface;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable("id") Long studentId){
        return new ResponseEntity<>(studentIntrface.getStudent(studentId), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllStudent(){
        return new ResponseEntity<>(studentIntrface.getAllStudent(),HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveStudent(@RequestBody Student student){
       return new ResponseEntity<>(studentIntrface.insertStudent(student),HttpStatus.OK);
    }

    @GetMapping("/higherGrades/{grade}")
    public ResponseEntity<Object> retrieveHigerGrades(@PathVariable("grade") Long grade){
        return new ResponseEntity<>(studentIntrface.retrieveHigherGrades(grade),HttpStatus.OK);
    }

    @PostMapping("/nativeInsert")
    public ResponseEntity<Object> nativeInsert(@RequestBody Student student){
        return new ResponseEntity<>(studentIntrface.nativeInsert(student),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void saveStudent(@PathVariable("id") Long idStudent){
        studentIntrface.deleteStudentById(idStudent);
    }

    @PutMapping
    public ResponseEntity<Object> updateStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentIntrface.updateStudent(student),HttpStatus.OK);
    }



}
