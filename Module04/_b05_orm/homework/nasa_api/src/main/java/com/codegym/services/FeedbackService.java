package com.codegym.services;

import com.codegym.models.Feedback;

import java.util.List;

public interface FeedbackService {
    List<Feedback> findAll();
    Feedback findById(int id);
    void save(Feedback feedback);
    void delete(int id);
}
