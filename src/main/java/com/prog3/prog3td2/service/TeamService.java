package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.TeamEntity;
import com.prog3.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository rep;

    public List<TeamEntity> getTeams(){
        return rep.findAll();
    }
}
