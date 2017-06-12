package io.happylrd.ivory.repository;

import io.happylrd.ivory.pojo.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
}
