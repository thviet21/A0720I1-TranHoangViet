package com.codegym.models;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int star;

    private String author;

    private String descFeedback;

    public Feedback() {

    }

    public Feedback(long id, int star, String author, String descFeedback) {
        this.id = id;
        this.star = star;
        this.author = author;
        this.descFeedback = descFeedback;
    }
}
