package com.yellocode.player.service.impl;

import com.yellocode.player.domain.Track;
import com.yellocode.player.repository.TrackRepository;
import com.yellocode.player.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DmitryL on 18.07.2017.
 */
@Transactional
public class TrackServiceImpl implements TrackService {

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public Track add(Track track) {
        Track savedTrack = trackRepository.saveAndFlush(track);
        return savedTrack;
    }

    @Override
    public void delete(long id) {
        trackRepository.delete(id);
    }

    @Override
    public Track edit(Track track) {
        return trackRepository.saveAndFlush(track);
    }

    @Override
    public List<Track> getAll() {
        return trackRepository.findAll();
    }
}
