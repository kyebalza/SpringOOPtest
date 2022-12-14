package com.sparta.test01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @GetMapping("/courses")
    public Course getCourses() {
        Course course = new Course();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("남병관");
        return course;
    }
}

class Course{
    String title;
    int days;
    String tutor;


    public void setTitle(String title) {
        this.title = title;
    }


    public void setDays(int days) {
        this.days = days;
    }


    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public String getTutor() {
        return tutor;
    }

}
