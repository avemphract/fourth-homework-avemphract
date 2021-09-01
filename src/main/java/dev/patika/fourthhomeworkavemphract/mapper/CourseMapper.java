package dev.patika.fourthhomeworkavemphract.mapper;

import dev.patika.fourthhomeworkavemphract.dto.CourseDTO;
import dev.patika.fourthhomeworkavemphract.model.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {
    Course customerDTOtoCustomer(CourseDTO courseDTO);
    CourseDTO customerToCustomerDTO(Course course);
}
