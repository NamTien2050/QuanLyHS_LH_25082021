package StudentAndClassroom.service;

import StudentAndClassroom.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
    public Page<Student> finAll(Pageable pageable);

    public Student finById(Long id);

    public Student save(Student student);

    public void remote(Student student);

    public Page<Student> findByName(String pageable);
}
