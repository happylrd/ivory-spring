package io.happylrd.ivory.service;

import io.happylrd.ivory.pojo.Course;
import io.happylrd.ivory.pojo.Student;

import java.util.List;

public interface StudentService {

    Student saveCourse(long id, long[] courseIds);

    List<Course> listSelectedCourse(long id);
}
