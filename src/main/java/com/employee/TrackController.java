package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
public class TrackController {
@Autowired
private TrackDAL tracks; 
	@GetMapping("/tracks")
	public List<Track> viewTracks(){
		return tracks.viewTracks();
	}
	@PostMapping("/tracks")
	public Track createTrack(@RequestBody Track t) {
		return tracks.createTrack(t);
	}
}
