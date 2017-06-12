package io.happylrd.ivory.controller;

import io.happylrd.ivory.common.ServerResponse;
import io.happylrd.ivory.pojo.Course;
import io.happylrd.ivory.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ServerResponse<List<Course>> list() {
        return ServerResponse.createBySuccess(courseRepository.findAll());
    }

    @PostMapping(value = "/courses")
    public ServerResponse<Course> save(Course course) {
        return ServerResponse.createBySuccess(courseRepository.save(course));
    }

    @GetMapping(value = "/courses/{id}")
    public ServerResponse<Course> get(@PathVariable("id") Long id) {
        return ServerResponse.createBySuccess(courseRepository.findOne(id));
    }

    @PutMapping(value = "/courses/{id}")
    public ServerResponse<Course> update(@PathVariable("id") Long id,
                                         @RequestBody Course course) {
        return ServerResponse.createBySuccess(courseRepository.save(course));
    }

    @DeleteMapping(value = "/courses/{id}")
    public void remove(@PathVariable("id") Long id) {
        courseRepository.delete(id);
    }
}
