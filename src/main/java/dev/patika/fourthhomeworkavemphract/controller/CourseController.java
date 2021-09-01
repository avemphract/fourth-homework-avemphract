package dev.patika.fourthhomeworkavemphract.controller;

import dev.patika.fourthhomeworkavemphract.dto.CourseDTO;
import dev.patika.fourthhomeworkavemphract.model.Course;
import dev.patika.fourthhomeworkavemphract.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController implements BaseController<Course, CourseDTO> {
    CourseService courseService;


    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Course> findById(@PathVariable int id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @Override
    @PostMapping("")
    public ResponseEntity<Course> save(@RequestBody CourseDTO body) {
        return ResponseEntity.ok(courseService.save(body));
    }

    @Override
    @PutMapping("")
    public ResponseEntity<Course> update(@RequestBody CourseDTO body) {
        return ResponseEntity.ok(courseService.update(body));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Course> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(courseService.deleteById(id));
    }
}
