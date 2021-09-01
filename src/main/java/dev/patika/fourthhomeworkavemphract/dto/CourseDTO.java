package dev.patika.fourthhomeworkavemphract.dto;

import dev.patika.fourthhomeworkavemphract.model.Instructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO implements BaseDTO {

    private int id;
    private String courseName;
    private String courseCode;
    private double credit;

    private int instructorId;
    private final Set<Integer> studentsId=new HashSet<>();
}
