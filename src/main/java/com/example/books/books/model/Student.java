package com.example.books.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
class Student {

    @Id
    Long id;

    @ManyToMany( mappedBy = "likes")
    Set<Course> likedCourses;

    // additional properties
    // standard constructors, getters, and setters
}