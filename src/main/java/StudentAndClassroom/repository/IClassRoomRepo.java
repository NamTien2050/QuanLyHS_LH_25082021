package StudentAndClassroom.repository;

import StudentAndClassroom.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClassRoomRepo extends PagingAndSortingRepository<ClassRoom,Long> {
}
