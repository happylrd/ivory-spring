package io.happylrd.ivory.repository

import io.happylrd.ivory.pojo.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository : JpaRepository<Course, Long> {
}