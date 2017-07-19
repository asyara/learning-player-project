package com.yellocode.player.service;


import com.yellocode.player.domain.Track;

import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface TrackService {

    Track addTrack(Track track);
    void delete(long id);
    Track editTrack(Track track);
    List<Track> getAll();
}
