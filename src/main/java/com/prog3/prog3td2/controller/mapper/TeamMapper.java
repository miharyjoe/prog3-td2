package com.prog3.prog3td2.controller.mapper;


import com.prog3.prog3td2.controller.response.TeamResponse;
import com.prog3.prog3td2.model.PlayerEntity;
import com.prog3.prog3td2.model.TeamEntity;
import com.prog3.prog3td2.repository.PlayerRepository;
import com.prog3.prog3td2.service.PlayerService;
import com.prog3.prog3td2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamMapper {
    private final PlayerService playerService;
    private final PlayerMapper mapper;
    private final SponsorService sponsorService;
    public TeamResponse toRest(TeamEntity domain){
        return TeamResponse.builder()
                .team_id(domain.getId())
                .name(domain.getName())
                .player((PlayerEntity) playerService.getPlayer().stream()
                        .map(mapper::toRest).toList())
                .sponsor(sponsorService.getSponsors().stream().map().toList())
                .build();
    }
}
