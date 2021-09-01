package dev.patika.fourthhomeworkavemphract.exception;

import dev.patika.fourthhomeworkavemphract.model.Student;

import java.time.Duration;
import java.time.LocalTime;

public class StudentAgeNotValidException extends RuntimeException{

    public StudentAgeNotValidException(Student student) {
        super("Student age not valid. Expected over 18 and below 40.\nActual: "+ Duration.between(student.getBirthDate(),LocalTime.now()).toDays()/365 +"\nStudent entity: "+student.toString());
    }

}