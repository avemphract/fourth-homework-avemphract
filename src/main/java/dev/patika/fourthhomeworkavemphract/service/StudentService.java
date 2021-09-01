package dev.patika.fourthhomeworkavemphract.service;

import dev.patika.fourthhomeworkavemphract.dto.StudentDTO;
import dev.patika.fourthhomeworkavemphract.mapper.StudentMapper;
import dev.patika.fourthhomeworkavemphract.model.Student;
import dev.patika.fourthhomeworkavemphract.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements BaseService<Student, StudentDTO> {
    StudentRepository studentRepository;
    StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list=new ArrayList<>();
        studentRepository.findAll().forEach(s->list.add(s));
        return list;
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student save(StudentDTO object) {
        return studentRepository.save(studentMapper.studentDTOtoStudent(object));
    }

    @Override
    public Student deleteById(int id) {
        return null;
    }

    @Override
    public Student update(StudentDTO object) {
        return null;
    }
}
