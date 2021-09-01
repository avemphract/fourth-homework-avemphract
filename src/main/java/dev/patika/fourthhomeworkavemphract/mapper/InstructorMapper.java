package dev.patika.fourthhomeworkavemphract.mapper;

import dev.patika.fourthhomeworkavemphract.dto.InstructorDTO;
import dev.patika.fourthhomeworkavemphract.model.Instructor;
import org.mapstruct.Mapper;



public interface InstructorMapper {
    Instructor instructorDTOtoInstructor(InstructorDTO instructorDTO);
    InstructorDTO instructorToInstructorDTO(Instructor instructor);

}
