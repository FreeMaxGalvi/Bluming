package ru.bluming.www.springbootapp.controllers;

import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import ru.bluming.www.springbootapp.entity.Category;
import ru.bluming.www.springbootapp.repository.CategoryRepository;
import ru.bluming.www.springbootapp.repository.GoodsRepository;
import ru.bluming.www.springbootapp.service.GoodsService;
import ru.bluming.www.springbootapp.service.impl.GoodsServiceImpl;

import java.util.Optional;

@RestController
public class HelloController {

    public CategoryRepository categoryRepository;

    @RequestMapping("/1")
    @ResponseBody
    String hello() {
        return "Hello World!";
    }

    @GetMapping(path = "/data")
    @ResponseBody
    public String DataB() {
        categoryRepository.findAll();
        return "allIsGood";
    }
}
