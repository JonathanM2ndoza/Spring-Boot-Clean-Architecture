package com.jmendoza.springboot.cleanarchitecture.adapter.controller;

import com.jmendoza.springboot.cleanarchitecture.adapter.controller.model.CircleWeb;
import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.CreateCircle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.GetCircle;

public class CircleWebController {

    private CreateCircle createCircle;
    private GetCircle getCircle;

    public CircleWebController() {
    }

    public CircleWebController(CreateCircle createCircle, GetCircle getCircle) {
        this.createCircle = createCircle;
        this.getCircle = getCircle;
    }

    public CircleWeb create(final CircleWeb circleWeb) {
        Circle circle = circleWeb.toCircle();
        return CircleWeb.toCircleWeb(createCircle.create(circle));
    }

    public CircleWeb getById(final String id) {
        Circle circle = getCircle.get(id).orElseThrow(() -> new RuntimeException("Circle not found"));
        return CircleWeb.toCircleWeb(circle);
    }
}
