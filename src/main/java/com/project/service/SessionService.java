package com.project.service;

import com.project.entity.Session;
import com.project.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SessionService {

    private final SessionRepository repo;

    public SessionService(SessionRepository repo) {
        this.repo = repo;
    }

    public Session createSession(String mentorId) {
        Session s = new Session();
        s.setId(UUID.randomUUID().toString());
        s.setMentorId(mentorId);
        s.setStatus("ACTIVE");
        return repo.save(s);
    }

    public Session joinSession(String sessionId, String studentId) {
        Session s = repo.findById(sessionId).orElseThrow();
        s.setStudentId(studentId);
        return repo.save(s);
    }
}