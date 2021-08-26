package StudentAndClassroom.repository;

import StudentAndClassroom.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface IStudentRepo extends PagingAndSortingRepository<Student, Long> {
    @Query(value = "select s from Student as s where s.name like concat('%',:name,'%') ")
    public Page<Student> findAllByName(@Param("name") String name);
    Page<Student> findAll(Pageable pageable);
}
