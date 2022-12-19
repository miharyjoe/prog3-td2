package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.controller.mapper.TeamMapper;
import com.prog3.prog3td2.controller.response.TeamResponse;
import com.prog3.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;

    private final TeamMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> findPlayers(){
        return service.getTeams().stream()
                .map(mapper::toRest).toList();
    }
}
