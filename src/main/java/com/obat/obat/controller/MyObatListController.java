package com.obat.obat.controller;

import com.obat.obat.service.MyObatListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyObatListController {

    @Autowired
    private MyObatListService service;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/my_obat";
    }
}
