package dev.patika.fourthhomeworkavemphract.exception;

import dev.patika.fourthhomeworkavemphract.model.Course;
import dev.patika.fourthhomeworkavemphract.model.Student;

public class StudentNumberForOneCourseExceededException extends RuntimeException{
    public StudentNumberForOneCourseExceededException(Student student, Course course) {
        super("Student number exceeded in course.\n Given student: "+student.toString()+"\nStudent course: "+course.toString());
    }
}
