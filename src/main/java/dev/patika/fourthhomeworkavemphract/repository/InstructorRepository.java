package dev.patika.fourthhomeworkavemphract.repository;

import dev.patika.fourthhomeworkavemphract.model.GuestInstructor;
import dev.patika.fourthhomeworkavemphract.model.Instructor;
import dev.patika.fourthhomeworkavemphract.model.RegularInstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor,Integer> {

    @Query("DELETE FROM Instructor AS i WHERE i.name= ?1")
    @Modifying
    void deleteByName(String name);

    @Query("SELECT i FROM Instructor AS i WHERE i.name= ?1")
    Instructor getByName(String name);

    @Query("SELECT i FROM RegularInstructor AS i ORDER BY i.constantSalary DESC ")
    List<RegularInstructor> getThreeHighestSalaryRegularInstructor();

    @Query("SELECT i FROM GuestInstructor AS i ORDER BY i.hourlySalary DESC ")
    List<GuestInstructor> getThreeHighestSalaryGuestInstructor();



}
