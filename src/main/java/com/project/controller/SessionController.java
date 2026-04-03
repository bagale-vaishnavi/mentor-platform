package com.project.controller;

import com.project.entity.Session;
import com.project.service.SessionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/session")
public class SessionController {

    private final SessionService service;

    public SessionController(SessionService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Session create(@RequestParam String mentorId) {
        return service.createSession(mentorId);
    }

    @PostMapping("/join")
    public Session join(@RequestParam String sessionId, @RequestParam String studentId) {
        return service.joinSession(sessionId, studentId);
    }
}