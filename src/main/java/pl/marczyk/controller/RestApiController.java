package pl.marczyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marczyk.RoomService;
import pl.marczyk.model.Device;
import pl.marczyk.model.Room;

/**
 * Created by MMARCZYK on 2015-10-27.
 */
@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/rooms")
    public Iterable<Room> getRooms() {
        return roomService.findAll();
    }

    @RequestMapping("/room/{id}")
    public Room getRoomBy(@PathVariable Long id){
        return roomService.findOne(id);
    }

    @RequestMapping("/room/{roomId}/devices")
    public Iterable<Device> getDevicesFromRoomBy(@PathVariable Long roomId){
        return roomService.findDevicesForRoom(roomId);
    }
}
