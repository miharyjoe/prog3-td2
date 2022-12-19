package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.PlayerEntity;
import com.prog3.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository rep;

    public List<PlayerEntity> getPlayer(){
        Sort sort =  Sort.by(Sort.Order.asc("number"));
    return rep.findAll(sort);
    }
}
