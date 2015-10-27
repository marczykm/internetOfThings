package pl.marczyk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marczyk.model.Device;
import pl.marczyk.model.Room;
import pl.marczyk.repository.RoomRepository;

/**
 * Created by MMARCZYK on 2015-10-27.
 */
@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Iterable<Room> findAll(){
        return roomRepository.findAll();
    }

    public Room findOne(Long id){
        return roomRepository.findOne(id);
    }

    public Iterable<Device> findDevicesForRoom(Long roomId){
        return roomRepository.findOne(roomId).getDevices();
    }
}
