package com.personal.audiobookms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Audiobook {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String authorName;
    private Integer rating;
    private Integer price;
}
