package com.jmendoza.springboot.cleanarchitecture.application.controller;

import com.jmendoza.springboot.cleanarchitecture.adapter.controller.CircleWebController;
import com.jmendoza.springboot.cleanarchitecture.adapter.controller.model.CircleWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shape")
public class CircleController {

    @Autowired
    private CircleWebController circleWebController;

    @PostMapping(value = "/circle")
    public CircleWeb create(@RequestBody final CircleWeb circleWeb) {
        return circleWebController.create(circleWeb);
    }

    @GetMapping(value = "/circle/{id}")
    public CircleWeb get(@PathVariable("id") final String id) {
        return circleWebController.getById(id);
    }
}