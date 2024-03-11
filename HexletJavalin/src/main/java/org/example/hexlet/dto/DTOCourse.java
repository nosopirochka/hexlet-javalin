package org.example.hexlet.dto;

import org.example.hexlet.model.Course;
import java.util.List;

public class DTOCourse {
    private String title;
    private List<Course> courses;

    public DTOCourse (String title, List<Course> courses) {
        this.title = title;
        this.courses = courses;
    }

    public String getTitle() {
        return title;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
