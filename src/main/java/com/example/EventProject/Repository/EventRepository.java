package com.example.EventProject.Repository;

import com.example.EventProject.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Long> {
}

