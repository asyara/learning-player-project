package com.yellocode.player.service.impl;

import com.yellocode.player.domain.Playlist;
import com.yellocode.player.repository.PlaylistRepository;
import com.yellocode.player.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by DmitryL on 19.07.2017.
 */
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public Playlist addPlaylist(Playlist playlist) {
        Playlist savedPlaylist = playlistRepository.saveAndFlush(playlist);
        return savedPlaylist;
    }

    @Override
    public void delete(long id) {
        playlistRepository.delete(id);
    }

    @Override
    public Playlist editPlaylist(Playlist playlist) {
        return playlistRepository.saveAndFlush(playlist);
    }

    @Override
    public List<Playlist> getAll() {
        return playlistRepository.findAll();
    }
}
