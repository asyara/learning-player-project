package com.yellocode.player.service;

import com.yellocode.player.domain.Playlist;
import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface PlaylistService {

    Playlist addPlaylist(Playlist playlist);
    void delete(long id);
    Playlist editPlaylist(Playlist playlist);
    List<Playlist> getAll();

}
