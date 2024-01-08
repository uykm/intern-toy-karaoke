package com.musibe.intern.karaoke.domain.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Todo {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(length = 100, nullable = false)
    private String name;
}
