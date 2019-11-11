package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TrackDALImpl implements TrackDAL {
@Autowired
private MongoTemplate tracks;
	@Override
	public Track createTrack(Track track) {
		
		return tracks.save(track);
	}

	@Override
	public List<Track> viewTracks() {
		
		return tracks.findAll(Track.class);
	}

}
