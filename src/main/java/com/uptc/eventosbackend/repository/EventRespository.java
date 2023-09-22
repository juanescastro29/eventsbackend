package com.uptc.eventosbackend.repository;

import com.uptc.eventosbackend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRespository extends JpaRepository<Event, Integer> {
}
