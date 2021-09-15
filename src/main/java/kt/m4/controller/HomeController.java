package kt.m4.controller;


import kt.m4.model.QuocGia;
import kt.m4.model.ThanhPho;
import kt.m4.service.QuocGiaService;
import kt.m4.service.ThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ThanhPhoService thanhPhoService;
    @Autowired
    QuocGiaService quocGiaService;

    @GetMapping("/show")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listTP", thanhPhoService.findAll());
        return modelAndView;
    }

    @ModelAttribute("quocgiaa")
    public List<QuocGia> lishQuocGia() {
       return quocGiaService.findAll();
    }

    @GetMapping("/view/{id}")
    public ModelAndView showDetail(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("tp", thanhPhoService.finById(id));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createShow() {
        ModelAndView modelAndView = new ModelAndView("createTP");
        modelAndView.addObject("tPho", new ThanhPho());
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editShow(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("editTP");
        modelAndView.addObject("thanhP", thanhPhoService.finById(id));
        modelAndView.addObject("listQuocgia",quocGiaService.findAll());
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteShow(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("deleteTP");
        modelAndView.addObject("deTP", thanhPhoService.finById(id));
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute ThanhPho thanhPho) {
        thanhPhoService.save(thanhPho);
        ModelAndView modelAndView= new ModelAndView("redirect:/show");
        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView edit(@ModelAttribute ThanhPho thanhPho) {
        thanhPhoService.save(thanhPho);
        return new ModelAndView("redirect:/show");
    }

    @PostMapping("/delete/{id}")
    public ModelAndView delete(@ModelAttribute ThanhPho thanhPho) {
        thanhPhoService.remove(thanhPho);
        return new ModelAndView("redirect:/show");
    }
}
