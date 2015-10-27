package pl.marczyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.marczyk.RoomService;
import pl.marczyk.model.Device;
import pl.marczyk.model.Room;

/**
 * Created by MMARCZYK on 2015-10-27.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private RoomService roomService;

    @RequestMapping
    public String index(Model model){
        Iterable<Room> rooms = roomService.findAll();
        model.addAttribute("rooms", rooms);

        return "index";
    }

    @RequestMapping("/room/{id}/devices")
    public String devicesFromRoom(@PathVariable Long id, Model model){
        Iterable<Device> devices = roomService.findDevicesForRoom(id);
        model.addAttribute("devices", devices);
        return "devices";
    }
}
