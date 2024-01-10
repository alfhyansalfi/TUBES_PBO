package com.obat.obat.controller;

import com.obat.obat.entity.MyObatList;
import com.obat.obat.entity.Obat;
import com.obat.obat.service.MyObatListService;
import com.obat.obat.service.ObatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ObatController {

    @Autowired
    private ObatService service;

    @Autowired
    private MyObatListService myObatService;


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/obat_register")
    public String obatRegister() {
        return "obatRegister";
    }

    @GetMapping("/available_obat")
    public ModelAndView getAllObat() {
        List<Obat> list=service.getAllObat();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("obatList");
//		m.addObject("obat",list);
        return new ModelAndView("obatList","obat",list);
    }

    @PostMapping("/save")
    public String addObat(@ModelAttribute Obat b) {
        service.save(b);
        return "redirect:/available_obat";
    }

    @GetMapping("/my_obat")
    public String getMyObat(Model model) {
        List<MyObatList>list=myObatService.getAllMyObat();
        model.addAttribute("obat",list);
        return "myObat";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Obat b=service.getObatById(id);
        MyObatList mb=new MyObatList(b.getId(),b.getNama(),b.getStok(),b.getHarga());
        myObatService.saveMyObat(mb);
        return "redirect:/my_obat";
    }

    @RequestMapping("/editObat/{id}")
    public String editObat(@PathVariable("id") int id,Model model) {
        Obat b=service.getObatById(id);
        model.addAttribute("obat",b);
        return "obatEdit";
    }

    @RequestMapping("/deleteObat/{id}")
    public String deleteObat(@PathVariable("id")int id) {
        service.deleteById(id);
        return "redirect:/available_obat";
    }
}
