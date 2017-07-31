package com.yellocode.player.service;

import com.yellocode.player.domain.Playlist;
import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface PlaylistService {

    Playlist add(Playlist playlist);
    void delete(long id);
    Playlist edit(long id, Playlist request);
    List<Playlist> getAll(int page, int size);
    Playlist getById(long id);

}
