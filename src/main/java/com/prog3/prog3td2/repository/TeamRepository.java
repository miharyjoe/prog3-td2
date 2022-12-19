package com.prog3.prog3td2.repository;

import com.prog3.prog3td2.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, String> {
}
