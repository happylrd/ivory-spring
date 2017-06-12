package io.happylrd.ivory.repository;

import io.happylrd.ivory.pojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
