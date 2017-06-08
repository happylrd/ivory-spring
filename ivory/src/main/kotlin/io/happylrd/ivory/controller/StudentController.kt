package io.happylrd.ivory.controller

import io.happylrd.ivory.pojo.Student
import io.happylrd.ivory.repository.StudentRepository
import org.springframework.web.bind.annotation.*

@RestController
class StudentController(val studentRepository: StudentRepository) {

    @GetMapping(value = "/students")
    fun listStudent() = studentRepository.findAll()

    @PostMapping(value = "/students")
    fun saveStudent(student: Student) = studentRepository.save(student)

    @GetMapping(value = "/students/{username}")
    fun getStudent(@PathVariable("username") username: String)
            = studentRepository.findByUsername(username)

    @PutMapping(value = "/students/{id}")
    fun updateStudent(@PathVariable("id") id: Long, @RequestBody student: Student)
            = studentRepository.save(student)

    @DeleteMapping(value = "/students/{id}")
    fun removeStudent(@PathVariable("id") id: Long)
            = studentRepository.delete(id)
}