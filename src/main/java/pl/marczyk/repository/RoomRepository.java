package pl.marczyk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.marczyk.model.Room;

/**
 * Created by MMARCZYK on 2015-10-27.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
