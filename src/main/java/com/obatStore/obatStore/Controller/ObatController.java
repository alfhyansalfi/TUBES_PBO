package com.obatStore.obatStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ObatController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
