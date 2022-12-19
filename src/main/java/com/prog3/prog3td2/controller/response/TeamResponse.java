package com.prog3.prog3td2.controller.response;

import com.prog3.prog3td2.model.PlayerEntity;
import com.prog3.prog3td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int team_id;
    private String name;
    private PlayerEntity player;
    private SponsorEntity sponsor;
}
