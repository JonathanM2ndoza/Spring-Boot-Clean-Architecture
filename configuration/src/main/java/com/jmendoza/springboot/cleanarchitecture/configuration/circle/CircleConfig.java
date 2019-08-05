package com.jmendoza.springboot.cleanarchitecture.configuration.circle;

import com.jmendoza.springboot.cleanarchitecture.adapter.controller.CircleWebController;
import com.jmendoza.springboot.cleanarchitecture.adapter.repository.InMemoryCircleRepository;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.CreateCircle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.GetCircle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.port.CircleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircleConfig {
    private final CircleRepository circleRepository = new InMemoryCircleRepository();

    @Bean
    public CreateCircle createCircle() {
        return new CreateCircle(circleRepository);
    }

    @Bean
    public GetCircle getCircle() {
        return new GetCircle(circleRepository);
    }

    @Bean
    public CircleWebController circleWebController() {
        return new CircleWebController(createCircle(), getCircle());
    }
}
