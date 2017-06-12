package io.happylrd.ivory.controller;

import io.happylrd.ivory.common.ServerResponse;
import io.happylrd.ivory.pojo.Student;
import io.happylrd.ivory.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "/students")
    public ServerResponse<List<Student>> list() {
        return ServerResponse.createBySuccess(studentRepository.findAll());
    }

    @PostMapping(value = "/students")
    public ServerResponse<Student> save(Student student) {
        return ServerResponse.createBySuccess(studentRepository.save(student));
    }

    @GetMapping(value = "/students/{username}")
    public ServerResponse<Student> getByUsername(
            @PathVariable("username") String username) {
        return ServerResponse.createBySuccess(studentRepository.findByUsername(username));
    }

    @PutMapping(value = "/students/{id}")
    public ServerResponse<Student> update(@PathVariable("id") Long id,
                                          @RequestBody Student student) {
        return ServerResponse.createBySuccess(studentRepository.save(student));
    }

    @DeleteMapping(value = "/students/{id}")
    public void remove(@PathVariable("id") Long id) {
        studentRepository.delete(id);
    }
}
