package com.prog3.prog3td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PlayerResponse {
    private int player_id;
    private String name;
}
