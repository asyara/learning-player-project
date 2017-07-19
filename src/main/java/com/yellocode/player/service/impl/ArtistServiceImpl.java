package com.yellocode.player.service.impl;

import com.yellocode.player.domain.Artist;
import com.yellocode.player.repository.ArtistRepository;
import com.yellocode.player.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by DmitryL on 19.07.2017.
 */
public class ArtistServiceImpl implements ArtistService{

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public Artist addArtist(Artist artist) {
        Artist savedArtist = artistRepository.saveAndFlush(artist);
        return savedArtist;
    }

    @Override
    public void delete(long id) {
    artistRepository.delete(id);
    }

    @Override
    public Artist editArtist(Artist artist) {
        return artistRepository.saveAndFlush(artist);
    }

    @Override
    public List<Artist> getAll() {
        return artistRepository.findAll();
    }
}
