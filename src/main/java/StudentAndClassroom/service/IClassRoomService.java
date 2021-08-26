package StudentAndClassroom.service;

import StudentAndClassroom.model.ClassRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClassRoomService {
    Page<ClassRoom> finAll(Pageable pageable);

    public Page<ClassRoom> finAll(ClassRoom classRoom);

}
