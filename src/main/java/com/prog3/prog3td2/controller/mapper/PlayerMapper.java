package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.controller.response.PlayerResponse;
import com.prog3.prog3td2.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerResponse toRest(PlayerEntity domain){
        return PlayerResponse.builder()
                .player_id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
