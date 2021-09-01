package dev.patika.fourthhomeworkavemphract.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@JsonTypeInfo(use= JsonTypeInfo.Id.DEDUCTION, defaultImpl = Instructor.class)
@JsonSubTypes({
        @JsonSubTypes.Type(GuestInstructor.class),
        @JsonSubTypes.Type(RegularInstructor.class)
})
@Entity @Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(exclude = "courses",callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Instructor extends BaseEntity {

    private String name;
    private String address;
    private long phoneNumber;
    @OneToMany(mappedBy = "instructor") @JsonManagedReference
    private final Set<Course> courses=new HashSet<>();
}
