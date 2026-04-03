package com.project.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class VideoSignalController {

    @MessageMapping("/signal")
    @SendTo("/topic/signal")
    public String signal(String message) {
        return message;
    }
}