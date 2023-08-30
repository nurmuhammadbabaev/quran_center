package com.example.quran.controller;

import com.example.quran.dto.CenterRequest;
import com.example.quran.service.CenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class CenterController {
    private final CenterService service;


    @GetMapping
    public String getMainPage(Model model) {
        model.addAttribute("companies", "Main Page");
        //Главная страница
        return "/company/main-page";
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        //Получения всех компании
        model.addAttribute("companies", service.getAll());
        //Страница всех компании
        return "/company/getAll";
    }


    @GetMapping("/new")
    public String newCompany(@ModelAttribute("company") CenterRequest quranCenterRequest) {
        //Страница для добавления компании в БД
        return "/company/addCompany";
    }

    @PostMapping("/save")
    public String addCompany(Model model, CenterRequest quranCenterRequest) {
        //Добавляем компании в БД
        model.addAttribute("company",service.create(quranCenterRequest));
        //После добавления вернемся обратно в главную страницу
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editCompany(@PathVariable("id") Long id, Model model) {
        model.addAttribute("company", service.getById(id));
        //Страница для изменения компании
        return "/company/updateCompany";
    }

    @PostMapping("/{id}")
    public String updateCompany(@PathVariable("id") Long id,CenterRequest centerRequest) {
        //Изменяем компании
         service.update(id, centerRequest);
        //После изменения вернемся обратно на страницу all
        return "redirect:/all";
    }

    @GetMapping("/{id}")
    public String deleteCompany(@PathVariable("id") Long id) {
        //Удаляем компании
        service.deleteById(id);
        //После удаления компании вернемся обратно на страницу all
        return "redirect:/all";
    }

}
