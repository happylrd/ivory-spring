package io.happylrd.ivory.controller;

import io.happylrd.ivory.common.ServerResponse;
import io.happylrd.ivory.pojo.StudentCourse;
import io.happylrd.ivory.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCourseController {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @GetMapping(value = "/studentcourses")
    public ServerResponse<List<StudentCourse>> list() {
        return ServerResponse.createBySuccess(studentCourseRepository.findAll());
    }

    @PostMapping(value = "/studentcourses")
    public ServerResponse<StudentCourse> save(StudentCourse studentCourse) {
        return ServerResponse.createBySuccess(studentCourseRepository.save(studentCourse));
    }

    @GetMapping(value = "/studentcourses/{id}")
    public ServerResponse<StudentCourse> get(@PathVariable("id") Long id) {
        return ServerResponse.createBySuccess(studentCourseRepository.findOne(id));
    }

    @PutMapping(value = "/studentcourses/{id}")
    public ServerResponse<StudentCourse> update(@PathVariable("id") Long id,
                                                @RequestBody StudentCourse studentCourse) {
        return ServerResponse.createBySuccess(studentCourseRepository.save(studentCourse));
    }

    @DeleteMapping(value = "/studentcourses/{id}")
    public void remove(@PathVariable("id") Long id) {
        studentCourseRepository.delete(id);
    }
}
