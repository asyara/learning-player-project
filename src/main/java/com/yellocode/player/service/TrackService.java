package com.yellocode.player.service;


import com.yellocode.player.domain.Track;

import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface TrackService {

    Track add(Track track);
    void delete(long id);
    Track edit(long id, Track track);
    List<Track> getAll(int page, int size);
    Track getById(long id);
}
