package dev.patika.fourthhomeworkavemphract.service;

import dev.patika.fourthhomeworkavemphract.dto.CourseDTO;
import dev.patika.fourthhomeworkavemphract.mapper.CourseMapper;
import dev.patika.fourthhomeworkavemphract.model.Course;
import dev.patika.fourthhomeworkavemphract.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService implements BaseService<Course, CourseDTO> {
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;


    @Override
    public List<Course> findAll() {
        List<Course> list=new ArrayList<>();
        courseRepository.findAll().forEach(n->list.add(n));
        return list;
    }

    @Override
    public Course findById(int id) {
        Optional<Course> optionalCourse=courseRepository.findById(id);
        if (optionalCourse.isPresent())
            return courseRepository.findById(id).get();
        else
            throw new RuntimeException();
    }

    @Override
    public Course save(CourseDTO object) {
        Course course=courseMapper.customerDTOtoCustomer(object);
        return courseRepository.save(course);
    }

    @Override
    public Course deleteById(int id) {
        Course course=courseRepository.findById(id).get();
        courseRepository.deleteById(id);
        return course;
    }

    @Override
    public Course update(CourseDTO object) {
        Course course=courseMapper.customerDTOtoCustomer(object);
        return courseRepository.save(course);
    }
}
