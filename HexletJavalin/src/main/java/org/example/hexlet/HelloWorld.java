package org.example.hexlet;

import io.javalin.Javalin;
import org.example.hexlet.dto.DTOCourse;
import org.example.hexlet.model.Course;
import java.util.List;
import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args) {
        var courses = List.of(
                new Course("course1", "about course1"),
                new Course("course2", "about course2"),
                new Course("course3", "about course3")
        );
        DTOCourse dto = new DTOCourse("Курсы", courses);

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/", ctx -> ctx.result("Hello World!"));
        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result(String.format("Hello, %s!", name));
        });
        app.get("/posts/{id}", ctx -> {
            ctx.result(ctx.pathParam("id"));
        });

        app.get("/courses", ctx -> {
            ctx.render("courses.jte", Collections.singletonMap("page", dto));
        });
        app.start(7070);
    }
}
