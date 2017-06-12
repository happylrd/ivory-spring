package io.happylrd.ivory.service.impl;

import io.happylrd.ivory.pojo.Course;
import io.happylrd.ivory.pojo.Student;
import io.happylrd.ivory.pojo.StudentCourse;
import io.happylrd.ivory.repository.CourseRepository;
import io.happylrd.ivory.repository.StudentRepository;
import io.happylrd.ivory.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Student saveCourse(long id, long[] courseIds) {
        Student student = studentRepository.findOne(id);

        for (long courseId : courseIds) {
            Course course = courseRepository.findOne(courseId);

            StudentCourse studentCourse = new StudentCourse();
            studentCourse.setStudent(student);
            studentCourse.setCourse(course);
            studentCourse.setScore(0);

            student.getStudentCourses().add(studentCourse);
            studentRepository.save(student);
        }

        return student;
    }

    @Override
    public List<Course> listSelectedCourse(long id) {
        return courseRepository.listByStudentId(id);
    }
}
