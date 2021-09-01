package dev.patika.fourthhomeworkavemphract.repository;

import dev.patika.fourthhomeworkavemphract.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {
    @Query("DELETE FROM Course AS c WHERE c.courseName= ?1")
    @Modifying
    void deleteByName(String name);

    @Query("SELECT c FROM Course AS c WHERE c.courseName= ?1")
    Course getByName(String name);
}
