package dev.patika.fourthhomeworkavemphract.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@EqualsAndHashCode(exclude = {"courses"}, callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity {
    private String name;
    private LocalDate birthDate;
    private String address;
    private String gender;

    @ManyToMany(targetEntity = Course.class, mappedBy = "students", cascade = CascadeType.MERGE) @JsonIgnore
    private final Set<Course> courses=new HashSet<>();
}
