package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Ezekiel Eromosei
 * @created: 27 January 2023
 */

@Controller
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }
}
