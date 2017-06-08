package io.happylrd.ivory.repository

import io.happylrd.ivory.pojo.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
    fun findByUsername(username: String): Student
}