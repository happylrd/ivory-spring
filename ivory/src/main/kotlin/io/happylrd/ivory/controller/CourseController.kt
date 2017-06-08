package io.happylrd.ivory.controller

import io.happylrd.ivory.pojo.Course
import io.happylrd.ivory.repository.CourseRepository
import org.springframework.web.bind.annotation.*

@RestController
class CourseController(val courseRepository: CourseRepository) {

    @GetMapping(value = "/courses")
    fun listCourse() = courseRepository.findAll()

    @PostMapping(value = "/courses")
    fun saveCourse(course: Course) = courseRepository.save(course)

    @GetMapping(value = "/courses/{id}")
    fun getCourse(@PathVariable("id") id: Long)
            = courseRepository.findOne(id)

    @PutMapping(value = "/courses/{id}")
    fun updateCourse(@PathVariable("id") id: Long, @RequestBody course: Course)
            = courseRepository.save(course)

    @DeleteMapping(value = "/courses/{id}")
    fun removeCourse(@PathVariable("id") id: Long)
            = courseRepository.delete(id)
}