package dev.patika.fourthhomeworkavemphract.mapper;

import dev.patika.fourthhomeworkavemphract.dto.StudentDTO;
import dev.patika.fourthhomeworkavemphract.model.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {
    Student studentDTOtoStudent(StudentDTO studentDTO);
    StudentDTO studentToStudentDTO(Student student);
}
