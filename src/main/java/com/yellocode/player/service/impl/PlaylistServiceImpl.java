package com.yellocode.player.service.impl;

import com.yellocode.player.domain.Playlist;
import com.yellocode.player.repository.PlaylistRepository;
import com.yellocode.player.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by DmitryL on 19.07.2017.
 */
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Override
    public Playlist add(Playlist playlist) {
        Playlist newPlaylist = new Playlist();
        newPlaylist.setPlaylistName(playlist.getPlaylistName());
        newPlaylist.setTracks(playlist.getTracks());
        playlistRepository.saveAndFlush(newPlaylist);
        return newPlaylist;
    }

    @Override
    public void delete(long id) {
        playlistRepository.delete(id);
    }

    @Override
    public Playlist edit(long id, Playlist request) {
        Playlist editedPlaylist = playlistRepository.findOne(id);
        editedPlaylist.setPlaylistName(request.getPlaylistName());
        editedPlaylist.setTracks(request.getTracks());
        return playlistRepository.saveAndFlush(request);
    }

    @Override
    public List<Playlist> getAll(int page, int size) {
        return playlistRepository.findAll();
    }

    @Override
    public Playlist getById(long id) {
        return playlistRepository.findOne(id);
    }
}
