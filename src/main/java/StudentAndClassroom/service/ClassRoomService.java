package StudentAndClassroom.service;

import StudentAndClassroom.model.ClassRoom;
import StudentAndClassroom.repository.IClassRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClassRoomService implements IClassRoomService {
    @Autowired
    IClassRoomRepo iClassRoomRepo;

    public ClassRoom findById(long id) {
        return iClassRoomRepo.findById(id).get();
    }

    public ClassRoom save(ClassRoom khachSan) {
        return iClassRoomRepo.save(khachSan);
    }

    public void delete(ClassRoom khachSan) {
        iClassRoomRepo.delete(khachSan);
    }

    @Override
    public Page<ClassRoom> finAll(Pageable pageable) {
        return iClassRoomRepo.findAll(pageable);
    }

    @Override
    public Page<ClassRoom> finAll(ClassRoom classRoom) {
        return (Page<ClassRoom>) iClassRoomRepo.findAll();
    }

//    public ArrayList<ClassRoom> findByName(String ten) {
//        return iClassRoomRepo.findAllByName(ten);
//    }
}
