package com.igreja_sede.igreja_sede.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.MainChurch;
import com.igreja_sede.igreja_sede.services.MainChurchService;

@RestController
@RequestMapping(value = "/mainchurch")
public class MainChurchResource {

	private final MainChurchService service;

    public MainChurchResource(MainChurchService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<MainChurch> getMainChurch() {
        MainChurch mainchurch = service.getMainChurch();

        if (mainchurch != null) {
            return ResponseEntity.ok(mainchurch);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	
}
