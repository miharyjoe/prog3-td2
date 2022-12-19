package com.prog3.prog3td2.repository;

import com.prog3.prog3td2.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String> {
}
