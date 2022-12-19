package com.prog3.prog3td2.controller.mapper;


import com.prog3.prog3td2.controller.response.TeamResponse;
import com.prog3.prog3td2.model.PlayerEntity;
import com.prog3.prog3td2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .team_id(domain.getId())
                .name(domain.getName())
                .player(domain.getPlayer)
                .sponsor(domain.getSponsor())
                .build();
    }
}
