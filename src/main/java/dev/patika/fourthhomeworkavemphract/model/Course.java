package dev.patika.fourthhomeworkavemphract.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@EqualsAndHashCode(exclude = {"instructor","students"},callSuper = false)
@Data @AllArgsConstructor @NoArgsConstructor
public class Course extends BaseEntity {
    private String courseName;
    private String courseCode;
    private double credit;
    
    @ManyToOne @JsonIgnore
    private Instructor instructor;

    @ManyToMany(targetEntity = Student.class, cascade = CascadeType.MERGE) @JsonIgnore
    private final Set<Student> students=new HashSet<>();

}
