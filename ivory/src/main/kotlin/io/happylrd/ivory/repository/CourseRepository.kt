package io.happylrd.ivory.repository

import io.happylrd.ivory.pojo.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CourseRepository : JpaRepository<Course, Long> {

    @Query("select c from Course c join c.studentCourses sc join sc.student s where c.id = sc.course and sc.student = s.id and s.id = :id")
    fun listByStudentId(id: Long): List<Course>
}