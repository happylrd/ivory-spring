package io.happylrd.ivory.repository;

import io.happylrd.ivory.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByUsername(String username);
}
