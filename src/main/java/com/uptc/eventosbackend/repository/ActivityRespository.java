package com.uptc.eventosbackend.repository;

import com.uptc.eventosbackend.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRespository extends JpaRepository<Activity, Integer> {
}
