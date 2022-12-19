package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.PlayAgainstEntity;
import com.prog3.prog3td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository rep;

    public List<PlayAgainstEntity> getMatchs(){
        return rep.findAll();
    }
}
