package com.project.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CodeController {

    @MessageMapping("/code")
    @SendTo("/topic/code")
    public String syncCode(String code) {
        return code;
    }
}