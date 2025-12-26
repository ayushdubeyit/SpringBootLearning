package com.spring_boot.json_api.controller;

import com.spring_boot.json_api.model.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public StatusResponse statuscheck() {

        return new StatusResponse( "up","spring-service");
    }

}
