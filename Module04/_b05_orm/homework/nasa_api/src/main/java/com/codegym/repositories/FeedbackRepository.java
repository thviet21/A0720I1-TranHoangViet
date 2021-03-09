package com.codegym.repositories;

import com.codegym.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {
}
