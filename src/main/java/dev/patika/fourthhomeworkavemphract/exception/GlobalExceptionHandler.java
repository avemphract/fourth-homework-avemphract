package dev.patika.fourthhomeworkavemphract.exception;

import dev.patika.fourthhomeworkavemphract.model.BaseEntity;
import dev.patika.fourthhomeworkavemphract.model.Course;
import dev.patika.fourthhomeworkavemphract.model.Instructor;
import dev.patika.fourthhomeworkavemphract.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<ErrorObject<Course>> handleException(CourseIsAlreadyExistException exception){
        ErrorObject<Course> respond = prepareErrorRespond(Course.class,exception.getCourse(),exception.getMessage());
        return new ResponseEntity<>(respond, HttpStatus.OK);
    }

    public ResponseEntity<ErrorObject<Instructor>> handleException(InstructorIsAlreadyExistException exception){
        ErrorObject<Instructor> respond = prepareErrorRespond(Instructor.class, exception.getInstructor(),exception.getMessage());
        return new ResponseEntity<>(respond, HttpStatus.OK);
    }

    private <T extends BaseEntity>ErrorObject<T> prepareErrorRespond(Class<T> c, T object, String string){
        ErrorObject<T> errorObject=new ErrorObject<>();
        errorObject.setErrorEntity(object);
        errorObject.setString(string);
        return errorObject;
    }
}
