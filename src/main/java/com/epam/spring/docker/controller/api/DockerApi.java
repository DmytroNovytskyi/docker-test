package com.epam.spring.docker.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface DockerApi {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/check")
    String check();

}
