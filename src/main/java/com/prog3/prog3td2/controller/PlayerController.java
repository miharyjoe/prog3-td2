package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.controller.mapper.PlayerMapper;
import com.prog3.prog3td2.controller.response.PlayerResponse;
import com.prog3.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;

    private final PlayerMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> findPlayers(){
        return service.getPlayer().stream()
                .map(mapper::toRest).toList();
    }
}
