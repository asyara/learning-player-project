package com.yellocode.player.service;

import com.yellocode.player.domain.Artist;
import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface ArtistService {

    Artist add(Artist artist);
    void delete(long id);
    Artist edit(Artist artist);
    List<Artist> getAll();
}
