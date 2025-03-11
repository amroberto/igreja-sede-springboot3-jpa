package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.entities.Position;
import com.igreja_sede.igreja_sede.entities.Presbytery;
import com.igreja_sede.igreja_sede.services.PresbyteryService;

@RestController
@RequestMapping(value = "/presbyteries")
public class PresbyteryResource {

	@Autowired
	private PresbyteryService service;
	
	@GetMapping
	public ResponseEntity<List<Presbytery>> findAll(){
		List<Presbytery> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
    @GetMapping("/community/{communityId}")
    public List<Presbytery> getPresbytersByCommunity(@PathVariable Long communityId) {
        Community community = new Community();
        community.setId(communityId);
        return service.getPresbytersByCommunity(community);
    }

    @GetMapping("/position/{positionId}")
    public List<Presbytery> getPresbytersByPosition(@PathVariable Long positionId) {
        Position position = new Position();
        position.setId(positionId);
        return service.getPresbytersByPosition(position);
    }
}
