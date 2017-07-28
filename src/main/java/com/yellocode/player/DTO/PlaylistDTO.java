package com.yellocode.player.DTO;

import com.yellocode.player.domain.Playlist;
import com.yellocode.player.domain.Track;
import java.util.List;

/**
 * Created by DmitryL on 23.07.2017.
 */
public class PlaylistDTO {

    private String playlistName;

    private List<Track> tracks;

    private List<Playlist> playlists;

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Playlist> getPlaylistsByUserId() {
        return playlists;
    }

    public void setPlaylistsByUserId(List<Playlist> playlists) {
        this.playlists = playlists;
    }
}
