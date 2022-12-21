package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.SponsorEntity;
import com.prog3.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository rep;

    public List<SponsorEntity> getSponsors(){
        return rep.findAll();
    }
}
