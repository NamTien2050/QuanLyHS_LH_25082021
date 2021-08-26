package StudentAndClassroom.service;

import StudentAndClassroom.model.Student;
import StudentAndClassroom.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    @Override
    public Page<Student> finAll(Pageable pageable) {
        return iStudentRepo.findAll(pageable);
    }

    @Override
    public Student finById(Long id) {
        return iStudentRepo.findById(id).get();
    }

    @Override
    public Student save(Student student) {
        return iStudentRepo.save(student);
    }

    @Override
    public void remote(Student student) {
        iStudentRepo.delete(student);
    }

    @Override
    public Page<Student> findByName(String name) {
        return iStudentRepo.findAllByName(name);
    }

}
