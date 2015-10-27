package pl.marczyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MMARCZYK on 2015-10-27.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping
    public String index(){
        return "index";
    }
}
