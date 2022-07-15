package com.epam.spring.docker.controller;

import com.epam.spring.docker.controller.api.DockerApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController implements DockerApi {

    @Override
    public String check() {
        return "Check completed";
    }

}
