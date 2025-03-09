package com.igreja_sede.igreja_sede.services;

import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.MainChurch;
import com.igreja_sede.igreja_sede.repositories.MainChurchRepository;

@Service
public class MainChurchService {

	private final MainChurchRepository mainChurchRepository;

    public MainChurchService(MainChurchRepository mainChurchRepository) {
        this.mainChurchRepository = mainChurchRepository;
    }

    public MainChurch getMainChurch() {
        return mainChurchRepository.findFirstByOrderByIdAsc().orElse(null);
    }
}
