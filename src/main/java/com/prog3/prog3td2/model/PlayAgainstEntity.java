package com.prog3.prog3td2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "play_against")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayAgainstEntity {
    @Id
    @Column(name ="play_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate datetime;
    private String stadium;

    @OneToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team1_id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team2_id;

}
