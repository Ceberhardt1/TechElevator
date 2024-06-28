package com.techelevator.reservations.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {



    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String checkHeartBeat() {
        return "yep I am alive!";
    }


}
